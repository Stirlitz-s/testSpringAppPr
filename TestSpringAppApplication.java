package com.example.testSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@EnableAspectJAutoProxy
@SpringBootApplication
@ComponentScan(basePackages="com.example")
public class TestSpringAppApplication {

	public static void main(String[] args) {
        System.out.println("fuck");
//        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        SpringApplication.run(TestSpringAppApplication.class, args);
        ConfigurableApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        TestCallAspect testCallAspect =
                applicationContext.getBean(TestCallAspect.class);
        testCallAspect.writeString1();
        applicationContext.close();
        System.out.println("fuck2");
      //  SpringApplication.run(TestCallAspect.class);
    }

}

