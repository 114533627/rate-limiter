package cn.caijiajia.ratelimiter.core.common.handler;

import cn.caijiajia.ratelimiter.core.common.web.ResultBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean allExceptionHandler(Exception e) {
        log.info("================进入异常处理================");
        ResultBean result = new ResultBean(500, e.getMessage());
        return result;
    }
}
