package org.note.mdm.controller;

import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedissonClient redissonClient;

    @GetMapping("/set")
    public String set(@RequestParam("key")String key,@RequestParam("value")String value) {
        RBucket<Object> bucket = redissonClient.getBucket(key);
        bucket.set(value);
        return key;
    }



}
