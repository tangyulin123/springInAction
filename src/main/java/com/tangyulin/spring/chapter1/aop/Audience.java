package com.tangyulin.spring.chapter1.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

    /**
     * 定义命名的切点
     */
    @Pointcut("execution(* com.tangyulin.spring.chapter1.aop.Performance.performance(..))")
    public void performance() {

    }
    /**
     * 表演之前
     */
    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silengcing cell phones");
    }

    /**
     * 表演之前
     */
    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    /**
     * 表演之后
     */
    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    /**
     * 表演失败之后
     */
    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

   /* @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint point) {
        try {
            System.out.println("Silengcing cell phones");
            System.out.println("Taking seats");
            point.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable a) {
            System.out.println("Demanding a refund");
        }
    }*/
}
