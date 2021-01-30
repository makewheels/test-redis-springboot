package com.example.testredis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("test")
public class TestController {
    @Resource
    private RedisService redisService;

    @RequestMapping("get")
    @ResponseBody
    public String get(@RequestParam String key) {
        redisService.set("hello", "world");
        return (String) redisService.get("hello");
    }
}
