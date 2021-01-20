package cn.caijiajia.ratelimiter.core.common.interceptor;

import cn.caijiajia.ratelimiter.core.common.util.MathUtils;
import cn.caijiajia.ratelimiter.core.common.web.util.RequestUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 日志拦截器
 *
 * @author hedongzhou
 * @date 2018/02/06
 */
@Slf4j
public class LogIntercepter implements HandlerInterceptor {

    private static final String START_TIME_KEY = "_log_start_time";

    /**
     * 准备处理
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws
            Exception {
        Thread.currentThread().setName("E-" +
                System.currentTimeMillis() + "-" +
                RandomUtils.nextInt(1000, 9999));

        log.info("START -- uri: {}, params: {}, ip: {}, referer: {}, platform: {}, clientip: {}",
                request.getRequestURI(),
                RequestUtils.getParameters2(request),
                RequestUtils.getIp(request),
                request.getHeader("referer"),
                request.getHeader("platform"),
                request.getHeader("clientip"));

        request.getSession().setAttribute(START_TIME_KEY, System.currentTimeMillis());

        return true;
    }

    /**
     * 处理
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
    }

    /**
     * 完成
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                Exception ex) throws Exception {
        long start = MathUtils.getLong(request.getSession().getAttribute(START_TIME_KEY));
        double time = start == 0 ? 0 : MathUtils.setScale((System.currentTimeMillis() - start) / 1000L).doubleValue();

        log.info("END -- uri: {}, time: {}s, ip: {}, referer: {}, platform: {}, clientip: {}",
                request.getRequestURI(),
                time,
                RequestUtils.getIp(request),
                request.getHeader("referer"),
                request.getHeader("platform"),
                request.getHeader("clientip"));

        if (time > 1) {
            log.warn("uri: {}, time: {}s, params: {}",
                    request.getRequestURI(),
                    time,
                    RequestUtils.getParameters(request));
        }
    }

}
