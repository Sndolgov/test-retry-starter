package com.test.controller;

import com.registrar.flyRegistration.BeanInfo;
import com.registrar.flyRegistration.BeanOnFlyRegistrar;
import com.test.registration.CollectionOfTestBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class Controller
{
    @Autowired
    private CollectionOfTestBeans testBeans;

    @Autowired
    private BeanOnFlyRegistrar flyRegistrar;

    @Autowired
    private GenericApplicationContext context;

    @GetMapping("registered")
    public List<String> getTestStrings(){
        return testBeans.getTestStrings();
    }

    @PostMapping("add/bean")
    public String addBeans(@RequestBody List<BeanInfo> beans){
        beans.forEach(b-> flyRegistrar.regBean(b));
        return "registered " + beans.size() + " bean(s)";
    }

}
