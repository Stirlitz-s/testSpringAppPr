package com.example.testSpringApp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    public TestCallAspect transferService(){
        return new TestCallAspect();
    }
    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}