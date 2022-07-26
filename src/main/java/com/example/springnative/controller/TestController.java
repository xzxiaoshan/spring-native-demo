package com.example.springnative.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author shanhy
 * @date 2022-07-04 17:39
 */
@RestController
@RequestMapping("/test")
public class TestController {

    /**
     * 测试
     *
     * @return
     */
    @GetMapping("/show")
    public Mono<String> show() {
        return Mono.just("OK");
    }
}
