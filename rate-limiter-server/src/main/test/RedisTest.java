import cn.caijiajia.ratelimiter.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RedisTest {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void test1() throws Exception {

        redisTemplate.opsForHash().put("test","1","11");

        Map test = redisTemplate.opsForHash().entries("test");
        test.entrySet().forEach(item -> System.out.println(((Map.Entry)item).getKey()+":"+((Map.Entry)item).getValue()));

    }


}
