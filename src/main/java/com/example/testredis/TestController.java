package com.example.testredis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("test")
public class TestController {
    @Resource
    private RedisTemplate redisTemplate;

    @RequestMapping("testRedis")
    @ResponseBody
    public String testRedis(@RequestParam String key) {
        System.out.println(redisTemplate.opsForValue().get("abc"));
        return (String) redisTemplate.opsForValue().get(key);
    }
}
