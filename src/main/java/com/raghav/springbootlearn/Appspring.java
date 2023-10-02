package com.raghav.springbootlearn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appspring {

    public static void main (String[] args){

//     we have launch a spring context using spring configuration file
        var context =new AnnotationConfigApplicationContext(SpringBootLearnApplication.class);

      System.out.println(context.getBean("name"));

    }
    
}
