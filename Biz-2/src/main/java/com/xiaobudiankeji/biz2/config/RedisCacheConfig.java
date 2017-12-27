package com.xiaobudiankeji.biz2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * redis
 * Created by gaomin on 2017/12/26.
 */
@Configuration
@EnableCaching
public class RedisCacheConfig {
    @Value("${spring.redis.host}")
    private  String redisHost;

    @Value("${spring.redis.port}")
    private  int redisPort;

    @Value("${spring.redis.password}")
    private  String password;

    @Bean
    public RedisConnectionFactory redisCF(){
        JedisConnectionFactory jcf=new JedisConnectionFactory();
        jcf.setHostName(redisHost);
        jcf.setPort(redisPort);
        jcf.setPassword(password);
        jcf.afterPropertiesSet();
        jcf.setUsePool(true);
        return  jcf;
    }

    @Bean
    public RedisTemplate redisTemplate(){
        final RedisTemplate< String, Object > template =  new RedisTemplate< String, Object >();
        template.setKeySerializer(new StringRedisSerializer());//指定key的序列化
        //template.setValueSerializer(new )
        template.setConnectionFactory( redisCF() );
        return template;
    }

    @Bean
    public CacheManager cacheManager(){

        return new RedisCacheManager(redisTemplate());
    }

}
