package com.tangyulin.spring.chapter1.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class PersonCount {

    private Map<Integer,Integer> personCounts = new HashMap<>();

    @Pointcut("execution(* com.tangyulin.spring.chapter1.aop.Performance.personCount(int)) && args(num)")
    public void personCount(int num) {

    }

    @Before("personCount(num)")
    public void countPerson(int num) {
        int i = personmanceCount(num);
        personCounts.put(num,i+1);
    }

    public int personmanceCount(int num) {
        return  personCounts.containsKey(num) ? personCounts.get(num) : 0;
    }
}
