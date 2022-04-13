package com.example.redis.bloom;

import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RBloomFilter;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/**
 * @author zhooke
 * @since 2022/4/13 10:09
 **/
@Slf4j
public class RedissonBloomFilter {
    public static void main(String[] args) {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://localhost:6379");
        config.useSingleServer().setPassword("123");
        RedissonClient redissonClient = Redisson.create(config);
        RBloomFilter<Object> bloomFilter = redissonClient.getBloomFilter("phoneList");
        bloomFilter.tryInit(100000000L,0.03);
        bloomFilter.add("10086");
        log.info("123456是否存在于布隆过滤器中：{}",bloomFilter.contains("123456"));
        log.info("10086是否存在于布隆过滤器中：{}",bloomFilter.contains("10086"));
    }
}
