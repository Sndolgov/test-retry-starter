package com.test;

import com.test.service.TestServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass=true)
public class RunAppl {
    public static void main(String[] args) throws Exception {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(RunAppl.class);
        ConfigurableApplicationContext run = builder.headless(false).run(args);

//        for (String name :run.getBeanDefinitionNames())
//            System.out.println(name);
        TestServiceImpl testServiceImpl = run.getBean(TestServiceImpl.class);
        System.out.println(testServiceImpl.test());
    }
}
