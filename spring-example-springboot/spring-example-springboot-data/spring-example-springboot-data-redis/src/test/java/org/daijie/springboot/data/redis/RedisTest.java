package org.daijie.springboot.data.redis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * @author daijie
 * @since 2019/4/15
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisStratUp.class)
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void save() throws InterruptedException {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("key1", "value1");
        Assert.assertTrue(valueOperations.get("key1").equals("value1"));
        valueOperations.set("key1", "value1", 1000, TimeUnit.MILLISECONDS);
        TimeUnit.MILLISECONDS.sleep(2000);
        Assert.assertTrue(valueOperations.get("key1") == null);
    }
}
