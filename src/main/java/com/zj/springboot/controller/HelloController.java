package com.zj.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableEurekaClient
@RestController
public class HelloController {
	@Value("${server.port}")
    String port;
    @GetMapping("/hello")
    public String home() {
        return "hi "+"jianzhang"+",i am from port:" +port;
    }


}
