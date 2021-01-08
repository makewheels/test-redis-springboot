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
    private RedisTemplate<String, Object> redisTemplate;

    @RequestMapping("get")
    @ResponseBody
    public String get(@RequestParam String key) {
        redisTemplate.opsForValue().set("hello", "world");
        return (String) redisTemplate.opsForValue().get(key);
    }
}
