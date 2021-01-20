/**
 * Caijiajia confidential
 * <p/>
 * Copyright (C) 2015 Shanghai Shuhe Co., Ltd. All rights reserved.
 * <p/>
 * No parts of this file may be reproduced or transmitted in any form or by any means,
 * electronic, mechanical, photocopying, recording, or otherwise, without prior written
 * permission of Shanghai Shuhe Co., Ltd.
 */
package cn.caijiajia.ratelimiter.server.controller;

import cn.caijiajia.ratelimiter.client.RateLimiterClient;
import cn.caijiajia.ratelimiter.core.common.annotation.ResponseResult;
import cn.caijiajia.ratelimiter.server.form.RateLimiterForm;
import cn.caijiajia.ratelimiter.server.service.RateLimiterService;
import cn.caijiajia.ratelimiter.server.service.RequestInfoService;
import cn.caijiajia.ratelimiter.server.vo.RateLimiterVo;
import cn.caijiajia.ratelimiter.server.vo.SimpleResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.stream.Collectors;


/**
 * @author wukaiqiang
 */
@ResponseResult
@RestController
public class RateLimiterController {
    @Autowired
    private RateLimiterService rateLimiterService;
    @Autowired
    private RequestInfoService requestInfoService;
    @Autowired
    private RateLimiterClient rateLimiterClient;


    @GetMapping(value = "/rate-limiters")
    public List<RateLimiterVo> getRateLimiters(@RequestParam(required = false) String apps,@RequestParam(required = false) Long id) {
        return rateLimiterService.getRateLimiters(apps,id);
    }

    @RequestMapping(value = "/rate-limiters", method = RequestMethod.POST)
    public void saveOrUpdateRateLimiter(@RequestBody RateLimiterForm form) {
        rateLimiterService.saveOrUpdateRateLimiter(form);
    }


    @RequestMapping(value = "/rate-limiters", method = RequestMethod.DELETE)
    public void deleteRateLimiter(@RequestParam String apps, @RequestParam String name) {
        rateLimiterService.deleteRateLimiter(apps, name);
    }

    @RequestMapping(value = "/rate-limiters/acquire")
    public Object acquire(@RequestParam String context, @RequestParam String names, HttpServletRequest request) {

        String[] split = names.split(",");
        requestInfoService.record(request, context);
        requestInfoService.blacklistHandler(request);

        Map<String, Boolean> collect = Arrays.asList(split).stream().collect(Collectors.toMap(item -> item, name -> rateLimiterClient.acquire(context, name)));

        return collect;
    }
}