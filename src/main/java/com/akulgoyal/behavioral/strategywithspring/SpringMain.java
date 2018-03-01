package com.akulgoyal.behavioral.strategywithspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMain {

    public static void main(String args[]) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringMain.class, args);
        applicationContext.getBean(SpringDuckSimulator.class).testDucks();
    }
}
