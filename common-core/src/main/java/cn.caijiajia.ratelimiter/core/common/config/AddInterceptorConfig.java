package cn.caijiajia.ratelimiter.core.common.config;

import cn.caijiajia.ratelimiter.core.common.interceptor.AuthInterceptor;
import cn.caijiajia.ratelimiter.core.common.interceptor.LogIntercepter;
import cn.caijiajia.ratelimiter.core.common.interceptor.ResponseResultInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class AddInterceptorConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private RedisTemplate redisTemplate;
    @Value("${securityKey:8001FDE7A197255F911CD79614747023}")//安全密钥，给到对接方
    private String securityKey;

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogIntercepter()).addPathPatterns("/**");
        registry.addInterceptor(new AuthInterceptor(redisTemplate,securityKey)).addPathPatterns("/**")
                .excludePathPatterns("/user/login");
        registry.addInterceptor(new ResponseResultInterceptor()).addPathPatterns("/**");
    }
}