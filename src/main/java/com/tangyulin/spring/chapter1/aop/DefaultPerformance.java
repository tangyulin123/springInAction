package com.tangyulin.spring.chapter1.aop;

import org.springframework.stereotype.Component;

@Component
public class DefaultPerformance implements Performance {

    @Override
    public void performance() {
        System.out.println("default performanceing dance!");
    }

    @Override
    public void personCount(int num) {
        System.out.println("num="+num++);
    }
}
