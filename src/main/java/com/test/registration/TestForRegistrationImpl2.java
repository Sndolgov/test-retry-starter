package com.test.registration;

public class TestForRegistrationImpl2 implements TestForRegistration
{
    private void postConstruct(){
        System.out.println("TestForRegistration was created");
    }

    @Override
    public String getTestString()
    {
        return "It is TestForRegistrationImpl 2";
    }
}
