package com.tangyulin.spring.chapter1.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EncoreableIntroducer {

    /**
     * 目的是将此接口引入Performance接口中，给予Performance接口来自Encoreable接口的能力
     */
    @DeclareParents(value = "com.tangyulin.spring.chapter1.aop.Performance+",defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
