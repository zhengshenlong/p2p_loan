package com.p2p.bean.service;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisServiceImpl {

    @Autowired
    private StringRedisTemplate redisTemplate;
    //将数据存入redis中  泛型方法      泛型类  泛型接口
    public <T> void set(String key , T obj , int seconds){
        String json = objToJson(obj);
        redisTemplate.opsForValue().set(key, json,seconds, TimeUnit.SECONDS);
    }

    private <T> String objToJson(T obj) {
        Class<?> clazz = obj.getClass();
        if(clazz == int.class || clazz == Integer.class){
            return String.valueOf(obj);
        }
        if(clazz == long.class || clazz == Long.class){
            return String.valueOf(obj);
        }
        return JSON.toJSONString(obj);
    }

    //将数据从redis中取出来
    public <T> T get(String key , Class<T> clazz){
        String json = redisTemplate.opsForValue().get(key);
        T obj = jsonToObj(json,clazz);
        return obj;
    }

    private <T> T jsonToObj(String json, Class<T> clazz) {
        if(clazz == String.class){
            return  (T)json;
        }
        if(clazz == int.class || clazz == Integer.class){
            return (T)Integer.valueOf(json);
        }
        if(clazz == long.class || clazz == Long.class){
            return (T)Long.valueOf(json);
        }
        return JSON.parseObject(json,clazz);
    }


}
