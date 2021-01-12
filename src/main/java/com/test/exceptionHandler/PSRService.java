package com.test.exceptionHandler;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSRService
{
    private final List<?> answers = List.of(true, false, new Papaya());
    private int position;

    public boolean isPositive(){
        if (position == answers.size())
            position = 0;
        System.out.println(position);
        Boolean answer = (Boolean) answers.get(position++);
        System.out.println(answer);
        return answer;
    }

    private static class Papaya
    {
    }
}
