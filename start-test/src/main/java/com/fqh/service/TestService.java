package com.fqh.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestService {

    @Resource
    private DemoService demoService;

    public void message() {
        System.out.println("code:" + demoService.getCode());
        System.out.println("message:" + demoService.getMessage());
    }
}
