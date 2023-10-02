package com.raghav.springbootlearn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02SpringGame {
     public static void main(String args[]){
           
        var context= new AnnotationConfigApplicationContext(GamingConfiguration.class);
        
        context.getBean(gamingConsole.class());
        

    



    }
    
}
