package com.hai.controller;

import com.hai.pojo.Dept;
import com.hai.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QueryController {

    @Autowired
    private QueryService queryService;

    @GetMapping("dept")
    public List<Dept> queryService(){
        return queryService.qeuryAllDept();
    }

    @GetMapping
    public String hello(){
        return "hello world";
    }
}
