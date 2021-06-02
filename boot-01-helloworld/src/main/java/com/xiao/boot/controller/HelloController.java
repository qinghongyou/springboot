package com.xiao.boot.controller;

import com.xiao.boot.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String handle01(@RequestParam("name") String name){
        log.warn("请求进来了...嘻嘻");
        return "Hello, Spring Boot 2!" + name;
    }

    @RequestMapping("/person")
    public Person person(){
        return person;
    }
}

