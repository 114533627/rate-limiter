package cn.caijiajia.ratelimiter.core.common.interceptor;

import cn.caijiajia.ratelimiter.core.common.annotation.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

@Slf4j
public class ResponseResultInterceptor implements HandlerInterceptor {

    public static String RESPONSE_RESULT_ANN = "RESPONSE_RESULT_ANN";

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        if(o instanceof HandlerMethod){
            HandlerMethod handler = (HandlerMethod) o;
            Class<?> beanType = handler.getBeanType();
            if(beanType.isAnnotationPresent(ResponseResult.class)){
                httpServletRequest.setAttribute(RESPONSE_RESULT_ANN,beanType.getAnnotation(ResponseResult.class));
                return true;
            }
            Method method = handler.getMethod();
            if(method.isAnnotationPresent(ResponseResult.class)){
                httpServletRequest.setAttribute(RESPONSE_RESULT_ANN,method.getAnnotation(ResponseResult.class));
                return true;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
