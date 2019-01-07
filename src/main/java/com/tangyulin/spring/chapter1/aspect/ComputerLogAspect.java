package com.tangyulin.spring.chapter1.aspect;

/**
 * @author tangyulin
 * @description
 * @createdate 12/28/2018
 */
public class ComputerLogAspect {

    public void beforeLog(){
        System.out.println("computer log start");
    }

    public void afterLog(){
        System.out.println("computer log end");
    }
}
