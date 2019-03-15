package com.ceiport.webcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ceiport.*"})
public class WebcontrollerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebcontrollerApplication.class, args);
    }

}
