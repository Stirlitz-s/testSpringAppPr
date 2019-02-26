package com.example.testSpringApp;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class LoggingAspect {
   // @Pointcut("execution(public * *(..))")
    @Pointcut("execution(* *.writeString1(..))")
    public void callAtMyServicePublic() {
        System.out.println("Before11");
    }
    @Before("callAtMyServicePublic()")
    public void logBeforeHello() {
        System.out.println("Before");
    }
    @After("callAtMyServicePublic()")
    public void logAfterHello() {
        System.out.println("After");
    }
}
