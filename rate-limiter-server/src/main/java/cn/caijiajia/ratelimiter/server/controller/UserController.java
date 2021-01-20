package cn.caijiajia.ratelimiter.server.controller;

import cn.caijiajia.ratelimiter.core.common.annotation.ResponseResult;
import cn.caijiajia.ratelimiter.core.common.web.BaseResultCode;
import cn.caijiajia.ratelimiter.core.common.web.PageRequest;
import cn.caijiajia.ratelimiter.core.common.web.PageResult;
import cn.caijiajia.ratelimiter.core.common.web.ResultBean;
import cn.caijiajia.ratelimiter.core.mybatis.page.PageUtils;
import cn.caijiajia.ratelimiter.core.mybatis.service.CommonDaoService;
import cn.caijiajia.ratelimiter.example.*;
import cn.caijiajia.ratelimiter.model.*;
import cn.caijiajia.ratelimiter.core.common.constants.SysConstants;
import cn.caijiajia.ratelimiter.server.util.EncryptUtils;
import cn.caijiajia.ratelimiter.server.vo.LoginReq;
import cn.caijiajia.ratelimiter.server.vo.TokenVo;
import cn.caijiajia.ratelimiter.server.vo.UserInfoVo;
import cn.caijiajia.ratelimiter.server.vo.UserVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@ResponseResult
@RestController
@RequestMapping
public class UserController {

    @Autowired(required = false)
    private CommonDaoService commonDaoService;
    @Autowired
    private RedisTemplate redisTemplate;

    @PostMapping("/user/login")
    public Object userLogin(@RequestBody LoginReq loginReq) {

        UserExample userExample = new UserExample();
        userExample.and().andLoginNameEqualTo(loginReq.getUsername());
        User user = commonDaoService.selectOneByExample(userExample);

        if (StringUtils.equals(user.getPassword(), EncryptUtils.md5(loginReq.getPassword() + SysConstants.user_pwd_salt))) {
            String token = UUID.randomUUID().toString();
            redisTemplate.opsForValue().set(SysConstants.user_token_redis_prefix + token, user.getId(), 60 * 60 * 12, TimeUnit.SECONDS);
            return new ResultBean(BaseResultCode.success.getCode(), BaseResultCode.success.getMessage(), new TokenVo(token));
        } else {
            throw new RuntimeException("用户名密码不正确");
        }
    }

    @GetMapping("/user/info")
    public Object userInfo(@RequestHeader("Authorization") String authorization) {
        String token = authorization.replaceAll("Bearer ", "");
        Object o = redisTemplate.opsForValue().get(SysConstants.user_token_redis_prefix + token);
        if (o == null) throw new RuntimeException("token无效");
        Long userId = (Long) o;
        User user = commonDaoService.get(User.class, userId);
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.and().andValid().andUserIdEqualTo(user.getId());
        List<UserRole> userRoles = commonDaoService.selectByExample(userRoleExample);

        RoleExample roleExample = new RoleExample();
        roleExample.and().andIdIn(userRoles.stream().map(UserRole::getRoleId).collect(Collectors.toList()));
        List<Role> roles = commonDaoService.selectByExample(roleExample);


        UserInfoVo userInfoVo = new UserInfoVo();
        userInfoVo.setAvatar(user.getAvatar());
        userInfoVo.setName(user.getName());
        userInfoVo.setRoles(roles.stream().map(Role::getRoleCode).collect(Collectors.toList()));
        if (userInfoVo.getRoles().size() > 0) {
            RolePermissionExample rolePermissionExample = new RolePermissionExample();
            rolePermissionExample.and().andRoleIdIn(roles.stream().map(Role::getId).collect(Collectors.toList()));
            List<RolePermission> rolePermissions = commonDaoService.selectByExample(rolePermissionExample);

            PermissionExample permissionExample = new PermissionExample();
            permissionExample.and().andIdIn(rolePermissions.stream().map(RolePermission::getPermissionId).collect(Collectors.toList()));
            List<Permission> permissions = commonDaoService.selectByExample(permissionExample);
            userInfoVo.setData(permissions.stream().map(Permission::getPermissionCode).collect(Collectors.toList()));
        }
        return userInfoVo;
    }

    @GetMapping("/user/list")
    public PageResult getUserLis(PageRequest pageRequest) {
        UserExample userExample = new UserExample();
        PageResult query = PageUtils.query(pageRequest, () -> commonDaoService.selectByExample(userExample));
        List<User> rows = (List<User>) query.getRows();
        ArrayList<UserVo> userVoArrayList = new ArrayList<UserVo>();
        rows.forEach(item -> {
            item.setPassword("");
            UserVo userVo = new UserVo(item);

            UserRoleExample userRoleExample = new UserRoleExample();
            userRoleExample.and().andValid().andUserIdEqualTo(item.getId());
            List<UserRole> userRoles = commonDaoService.selectByExample(userRoleExample);

            RoleExample roleExample = new RoleExample();
            roleExample.and().andIdIn(userRoles.stream().map(UserRole::getRoleId).collect(Collectors.toList()));
            List<Role> roles = commonDaoService.selectByExample(roleExample);
            userVo.setErpMemberRoles(roles);
            userVoArrayList.add(userVo);
        });
        query.setRows(userVoArrayList);
        return query;
    }

    @PostMapping("/user/password/update")
    public Object userLogin(@RequestBody User user) {

        User user2 = commonDaoService.get(User.class, user.getId());
        if (user2 == null) throw new RuntimeException("用户不存在");
        if (StringUtils.isBlank(user.getPassword())) throw new RuntimeException("用户密码不能为空");

        user2.setPassword(EncryptUtils.md5(user.getPassword() + SysConstants.user_pwd_salt));
        commonDaoService.update(user2);
        return "susscess";
    }
}
