package com.test.service;

import com.starter.Retry;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Random;

import static com.test.config.SpringProfiles.PROD;

@Service
@Profile(PROD)
public class TestProdServiceImpl implements TestService{
    @Retry(tries = 3, delay = 500)
    public String  test() throws Exception {
        int i = new Random().nextInt(10);
        if (i<7){
            throw new Exception("You were unlucky");
        } else
            return "Hello world!";
    }
}
