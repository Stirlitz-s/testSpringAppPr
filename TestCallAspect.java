package com.example.testSpringApp;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

public class TestCallAspect {
    public void writeString1() {
        System.out.println("writeString");
    }
}
