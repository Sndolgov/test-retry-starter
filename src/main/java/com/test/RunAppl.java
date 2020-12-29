package com.test;

import com.test.service.TestService;
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
        TestService testService = run.getBean(TestService.class);
        System.out.println(testService.test());
    }

    // set yourself bean instead the bean from starter
//    @Bean(name = "informationIntroducer")
//    public void getInformationIntroducer(){
//        System.out.println("*********************  IT IS DEV   **********************");
//    }
}
