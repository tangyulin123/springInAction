package com.tangyulin.spring.chapter1.aop;

public class DefaultEncoreable implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("performEncore is runing");
    }
}
