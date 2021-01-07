package com.test.registration;

import org.springframework.beans.factory.annotation.Autowired;

public interface TestForRegistration
{
    String getTestString();

    @Autowired
    default void register(CollectionOfTestBeans collection){
        collection.registerNewTestBean(this);
    }
}
