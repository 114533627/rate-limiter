package cn.caijiajia.ratelimiter.server.service;

import cn.caijiajia.ratelimiter.core.common.web.PageRequest;
import cn.caijiajia.ratelimiter.core.common.web.PageResult;
import cn.caijiajia.ratelimiter.core.mybatis.page.PageUtils;
import cn.caijiajia.ratelimiter.core.mybatis.service.CommonDaoService;
import cn.caijiajia.ratelimiter.example.SysConfigExample;
import cn.caijiajia.ratelimiter.model.SysConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysConfigService {

    @Autowired
    private CommonDaoService commonDaoService;

    public SysConfig getByCode(String apps, String code) {
        SysConfigExample sysConfigExample = new SysConfigExample();
        sysConfigExample.and().andAppsEqualTo(apps).andCodeEqualTo(code);
        return commonDaoService.selectOneByExample(sysConfigExample);
    }

    public PageResult getList(String apps, PageRequest pageRequest) {
        SysConfigExample sysConfigExample = new SysConfigExample();
        sysConfigExample.and().andAppsEqualTo(apps);
        PageResult query = PageUtils.query(pageRequest, () -> commonDaoService.selectByExample(sysConfigExample));
        return query;
    }

    public int save(SysConfig sysConfig) {
        int i = 0;
        if (sysConfig.getId() != null) i = commonDaoService.update(sysConfig);
        else i = commonDaoService.insert(sysConfig);
        return i;
    }

    public int del(Long id) {
        return commonDaoService.deletePhysically(SysConfig.class, id);
    }
}
