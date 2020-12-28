package com.test.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class TestServiceImpl {
//    @Retry(tries = 2, delay = 500)
    public String  test() throws Exception {
        int i = new Random().nextInt(10);
        if (i<8){
            throw new Exception("You were unlucky");
        } else
            return "Hello world!";
    }
}
