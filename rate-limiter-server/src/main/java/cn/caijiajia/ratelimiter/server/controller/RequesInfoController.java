package cn.caijiajia.ratelimiter.server.controller;

import cn.caijiajia.ratelimiter.core.common.annotation.ResponseResult;
import cn.caijiajia.ratelimiter.core.common.web.PageRequest;
import cn.caijiajia.ratelimiter.core.common.web.PageResult;
import cn.caijiajia.ratelimiter.server.service.RequestInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@ResponseResult
@RestController
@RequestMapping
public class RequesInfoController {

    @Autowired
    private RequestInfoService requestInfoService;

    @GetMapping("/request_info/list")
    public PageResult getRequestInfoList(@RequestParam(required = false) String apps,
                                         @RequestParam(required = false) String startTime,
                                         @RequestParam(required = false) String endTime, PageRequest pageRequest) throws Exception {
        return requestInfoService.getRequestInfoList(apps, startTime, endTime, pageRequest);
    }

    @GetMapping("/request_info/ip_sum")
    public PageResult sumRequestInfoByIpList(@RequestParam(required = false) String apps,
                                         @RequestParam(required = false) String startTime,
                                         @RequestParam(required = false) String endTime, PageRequest pageRequest) throws Exception {
        return requestInfoService.sumRequestInfoByIpList(apps, startTime, endTime, pageRequest);
    }
}
