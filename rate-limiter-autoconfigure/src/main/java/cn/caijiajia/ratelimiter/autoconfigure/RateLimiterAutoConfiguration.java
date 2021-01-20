package cn.caijiajia.ratelimiter.autoconfigure;

import cn.caijiajia.ratelimiter.client.RateLimiterClient;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author wukaiqiang
 */
@Configuration
@AutoConfigureAfter(RedisAutoConfiguration.class)
public class RateLimiterAutoConfiguration {

    private StringRedisTemplate stringRedisTemplate;

    public RateLimiterAutoConfiguration(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }


    @Bean
    public DefaultRedisScript<Long> rateLimiterLua() {
        DefaultRedisScript<Long> defaultRedisScript = new DefaultRedisScript<Long>();
        defaultRedisScript.setLocation(new ClassPathResource("rate_limiter.lua"));
        defaultRedisScript.setResultType(Long.class);
        return defaultRedisScript;
    }

    @Bean
    @ConditionalOnMissingBean(name = "rateLimiterClient")
    public RateLimiterClient rateLimiterClient() {
        return new RateLimiterClient(stringRedisTemplate, rateLimiterLua());
    }

    @Bean
    public RedisTemplate myRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> stringObjectRedisTemplate = new RedisTemplate<>();
        stringObjectRedisTemplate.setConnectionFactory(redisConnectionFactory);
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        stringObjectRedisTemplate.setKeySerializer(stringRedisSerializer);
        stringObjectRedisTemplate.setHashKeySerializer(stringRedisSerializer);
        return stringObjectRedisTemplate;
    }
}
