package com.jiawa.wiki.controller;


import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Value("${test.hello}")
    private  String testhello;
    @Resource
    private TestService testService;
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!"+testhello;
    }



    @GetMapping("/test/list")
    public List<Test> list(){return testService.list();}

}
