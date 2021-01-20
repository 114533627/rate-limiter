package cn.caijiajia.ratelimiter.core.common.interceptor;


import cn.caijiajia.ratelimiter.core.common.constants.SysConstants;
import cn.caijiajia.ratelimiter.core.common.exception.TokenInvalidException;
import cn.caijiajia.ratelimiter.core.common.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.DigestUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
@Slf4j
public class AuthInterceptor implements HandlerInterceptor {

    private String securityKey;
    private RedisTemplate redisTemplate;

    public AuthInterceptor( RedisTemplate redisTemplate ,String securityKey){
        this.redisTemplate = redisTemplate;
        this.securityKey = securityKey;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o) throws Exception {
        if (request.getRequestURI().equals("/rate-limiters/acquire")) {
            String sign = request.getHeader("sign");
            String timestamp = request.getHeader("timestamp");
            timestamp = timestamp == null ? "0" : timestamp;
            if (Math.abs(System.currentTimeMillis() - Long.valueOf(timestamp)) > 1000 * 60 * 5)
                throw new RuntimeException("时间戳无效");
            String sign2 = null;
            try {
                sign2 = DigestUtils.md5DigestAsHex(new String(securityKey + timestamp).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                log.error(e.getMessage());
            }
            if (!StringUtils.equalsIgnoreCase(sign, sign2)) throw new RuntimeException("验签失败");
        } else {
            String authorization = request.getHeader("Authorization");
            if(authorization == null) throw new RuntimeException("未授权");
            String token = authorization.replaceAll("Bearer ", "");
            Object o1 = redisTemplate.opsForValue().get(SysConstants.user_token_redis_prefix + token);
            if(o1 == null) throw new TokenInvalidException("token失效");
            Long userId = (Long) o1;
            request.setAttribute(SysConstants.request_attr_user_id,userId);
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
