package com.hai.controller;

import com.hai.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @GetMapping("test")
    @ResponseBody
    public List<Dept> test(){
        List<Dept> list= restTemplate.getForObject("http://CLIENT/dept", List.class);
        return list;
    }

    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }
}
