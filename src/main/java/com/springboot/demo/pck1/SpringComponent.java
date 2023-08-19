package com.springboot.demo.pck1;

import org.springframework.stereotype.Component;

@Component
public class SpringComponent {

    public void getMessage(){
        System.out.println("Hello from spring component");
    }
}
