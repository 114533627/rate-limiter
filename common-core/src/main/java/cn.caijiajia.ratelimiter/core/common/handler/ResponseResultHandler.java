package cn.caijiajia.ratelimiter.core.common.handler;

import cn.caijiajia.ratelimiter.core.common.interceptor.ResponseResultInterceptor;
import cn.caijiajia.ratelimiter.core.common.util.JsonUtils;
import cn.caijiajia.ratelimiter.core.common.web.BaseResultCode;
import cn.caijiajia.ratelimiter.core.common.web.ResultBean;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice
public class ResponseResultHandler implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        Object responseResult = sra.getRequest().getAttribute(ResponseResultInterceptor.RESPONSE_RESULT_ANN);
        return responseResult != null;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if (body instanceof ResultBean) return (ResultBean) body;
        //当返回类型是String时，用的是StringHttpMessageConverter转换器，无法转换为Json格式
        //必须在方法体上标注RequestMapping(produces = "application/json; charset=UTF-8")
        if (body instanceof String) {
            String str = JsonUtils.toString(new ResultBean(BaseResultCode.success.getCode(), BaseResultCode.success.getMessage(), body));
            return str;
        }
        return new ResultBean(BaseResultCode.success.getCode(), BaseResultCode.success.getMessage(), body);
    }
}
