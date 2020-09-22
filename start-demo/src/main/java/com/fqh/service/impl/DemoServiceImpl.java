package com.fqh.service.impl;

import com.fqh.service.DemoService;

public class DemoServiceImpl implements DemoService {

    @Override
    public String getMessage() {
        return "Hello SpringBoot startDemo!";
    }

    @Override
    public Integer getCode() {
        return 200;
    }
}
