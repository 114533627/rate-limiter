package cn.caijiajia.ratelimiter.server.controller;

import cn.caijiajia.ratelimiter.core.common.annotation.ResponseResult;
import cn.caijiajia.ratelimiter.core.mybatis.service.CommonDaoService;
import cn.caijiajia.ratelimiter.example.PermissionExample;
import cn.caijiajia.ratelimiter.example.RoleExample;
import cn.caijiajia.ratelimiter.example.RolePermissionExample;
import cn.caijiajia.ratelimiter.model.Permission;
import cn.caijiajia.ratelimiter.model.Role;
import cn.caijiajia.ratelimiter.model.RolePermission;
import cn.caijiajia.ratelimiter.server.vo.PermissionVo;
import cn.caijiajia.ratelimiter.server.vo.RolePermissionReq;
import cn.caijiajia.ratelimiter.server.vo.RoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@ResponseResult
@RequestMapping
public class PermissionController {

    @Autowired(required = false)
    private CommonDaoService commonDaoService;


    @GetMapping({"/permission/all", "/permission/resource"})
    public Object getAll() {
        ArrayList<PermissionVo> permissionVos = new ArrayList<>();
        PermissionExample permissionExample = new PermissionExample();
        permissionExample.and().andResourceLevelEqualTo(1);
        List<Permission> permissions = commonDaoService.selectByExample(permissionExample);
        permissions.forEach(item -> {
            PermissionVo permissionVo = new PermissionVo(item);
            setChild(permissionVo);
            permissionVos.add(permissionVo);
        });

        return permissionVos;
    }

    private void setChild(PermissionVo permissionVo) {
        PermissionExample permissionExample = new PermissionExample();
        permissionExample.and().andParentIdEqualTo(permissionVo.getId());
        List<Permission> permissions = commonDaoService.selectByExample(permissionExample);
        ArrayList<PermissionVo> permissionVos = new ArrayList<>();
        permissionVo.setErpMemberPermissions(permissionVos);
        if (permissions.size() == 0) return;
        permissions.forEach(item -> {
            PermissionVo permissionVo2 = new PermissionVo(item);
            setChild(permissionVo2);
            permissionVos.add(permissionVo2);
        });
    }

    @GetMapping({"/permission/level"})
    public Object getAll(@RequestParam Long id) {
        PermissionExample permissionExample = new PermissionExample();
        permissionExample.and().andParentIdEqualTo(id);
        return commonDaoService.selectByExample(permissionExample);
    }

    @PostMapping(value = "/permission/save", produces = {"application/json;charset=UTF-8"})
    public Object savePermission(@RequestBody Permission permission) {

        if (permission.getId() != null) {
            return commonDaoService.update(permission);
        } else {
            return commonDaoService.insert(permission);
        }
    }

    @GetMapping("/role/list")
    public Object roleList() {
        RoleExample roleExample = new RoleExample();
        List<Role> roles = commonDaoService.selectByExample(roleExample);
        ArrayList<RoleVo> roleVoArrayList = new ArrayList<RoleVo>();
        roles.forEach(item -> {
            RolePermissionExample rolePermissionExample = new RolePermissionExample();
            rolePermissionExample.and().andRoleIdEqualTo(item.getId());
            List<RolePermission> rolePermissions = commonDaoService.selectByExample(rolePermissionExample);

            PermissionExample permissionExample = new PermissionExample();
            permissionExample.and().andIdIn(rolePermissions.stream().map(RolePermission::getPermissionId).collect(Collectors.toList()));
            List<Permission> permissions = commonDaoService.selectByExample(permissionExample);
            RoleVo roleVo = new RoleVo(item);
            roleVo.setErpMemberPermissions(permissions);
            roleVoArrayList.add(roleVo);
        });

        return roleVoArrayList;
    }

    @PostMapping("/role/permission/save")
    public Object rolePermissionSave(@RequestBody RolePermissionReq rolePermissionReq) {
        List<Long> ids = rolePermissionReq.getIds();
        Long roleId = rolePermissionReq.getRoleId();
        RolePermissionExample rolePermissionExample = new RolePermissionExample();
        ids.forEach(item -> {
            rolePermissionExample.clear();
            rolePermissionExample.and().andRoleIdEqualTo(roleId).andPermissionIdEqualTo(item);
            if (commonDaoService.selectCountByExample(rolePermissionExample) == 0) {
                RolePermission rolePermission = new RolePermission();
                rolePermission.setRoleId(roleId);
                rolePermission.setPermissionId(item);
                commonDaoService.insert(rolePermission);
            }
        });
        rolePermissionExample.clear();
        rolePermissionExample.and().andRoleIdEqualTo(roleId).andPermissionIdNotIn(ids);
        List<RolePermission> rolePermissions = commonDaoService.selectByExample(rolePermissionExample);
        rolePermissions.forEach(item -> {
            commonDaoService.deletePhysically(item);
        });
        return "success";
    }
}
