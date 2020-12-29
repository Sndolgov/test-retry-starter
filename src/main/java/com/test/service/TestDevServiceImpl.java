package com.test.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Random;

import static com.test.config.SpringProfiles.DEV;

@Service("informationIntroducer")
@Profile(DEV)
public class TestDevServiceImpl implements TestService{
    public String  test() throws Exception {
        int i = new Random().nextInt(10);
        System.out.println("It is DEV and you have just one attempt");
        if (i<8){
            throw new Exception("You were unlucky");
        } else
            return "Hello world!";
    }
}
