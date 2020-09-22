package com.fqh;

import com.fqh.service.DemoService;
import com.fqh.service.impl.DemoServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DemoAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(DemoService.class)
    public DemoService demoService() {
        System.out.println("init DemoService");
        return new DemoServiceImpl();
    }
}
