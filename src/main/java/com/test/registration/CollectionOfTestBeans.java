package com.test.registration;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CollectionOfTestBeans
{
    private List<TestForRegistration> listTestBeans = new ArrayList<>();

    public List<String> getTestStrings(){
        return listTestBeans.stream().map(TestForRegistration::getTestString).collect(Collectors.toList());
    }

    public void registerNewTestBean(TestForRegistration newBean){
        listTestBeans.add(newBean);
    }
}
