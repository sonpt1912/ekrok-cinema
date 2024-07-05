package com.example.cinemaservice.controller.publicAPI;

import com.example.config.EnableWrapResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/cinema/public")
@EnableWrapResponse
public class CinemaPublicController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/test")
    public String test() {
        return "this is message for public api test";
    }

    @PostMapping("/city")
    public ResponseEntity getAllCity() {
        return null;
    }

    @PostMapping("/")
    public ResponseEntity getAllmove() {
        return null;
    }


}
