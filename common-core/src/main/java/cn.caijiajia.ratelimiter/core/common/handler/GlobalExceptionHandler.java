package cn.caijiajia.ratelimiter.core.common.handler;

import cn.caijiajia.ratelimiter.core.common.exception.TokenInvalidException;
import cn.caijiajia.ratelimiter.core.common.web.ResultBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

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

    @ExceptionHandler(TokenInvalidException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResultBean tokenInvalidExceptionHandler(Exception e) {
        log.info("================未授权异常处理================");
        ResultBean result = new ResultBean(HttpStatus.UNAUTHORIZED.value(), e.getMessage());
        return result;
    }
}
