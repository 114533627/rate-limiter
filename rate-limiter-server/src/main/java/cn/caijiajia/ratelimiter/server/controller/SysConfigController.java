package cn.caijiajia.ratelimiter.server.controller;

import cn.caijiajia.ratelimiter.core.common.annotation.ResponseResult;
import cn.caijiajia.ratelimiter.core.common.web.PageRequest;
import cn.caijiajia.ratelimiter.model.SysConfig;
import cn.caijiajia.ratelimiter.server.service.RequestInfoService;
import cn.caijiajia.ratelimiter.server.service.SysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@ResponseResult
@RestController
@RequestMapping
public class SysConfigController {

    @Autowired
    private SysConfigService sysConfigService;
    @Autowired
    private RequestInfoService requestInfoService;

    @GetMapping("/sys_config/list")
    public Object getList(@RequestParam(required = false) String apps, PageRequest pageRequest) {
        return sysConfigService.getList(apps, pageRequest);
    }

    @PostMapping("/sys_config/save")
    public Object save(@RequestBody SysConfig sysConfig) {
        return sysConfigService.save(sysConfig);
    }

    @DeleteMapping("/sys_config/del")
    public Object del(@RequestParam Long id) {
        return sysConfigService.del(id);
    }

    @PostMapping("/sys_config/flush_blacklist")
    public void flushBlacklist() {
        requestInfoService.blacklistIpToRedis();
    }
}
