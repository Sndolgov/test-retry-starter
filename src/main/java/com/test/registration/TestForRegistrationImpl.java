package com.test.registration;


import com.registrar.annotationRegistration.Singleton;

import javax.annotation.PostConstruct;

@Singleton
public class TestForRegistrationImpl implements TestForRegistration
{
    @PostConstruct
    private void postConstruct(){
        System.out.println("TestForRegistration was created");
    }

    @Override
    public String getTestString()
    {
        return "It is TestForRegistrationImpl";
    }
}
