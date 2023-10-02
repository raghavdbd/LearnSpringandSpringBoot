package com.raghav.springbootlearn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

record person(String name,int age){ };
record address (String firstLine,String SecondLine){ };

public class Helloworldconfiguration {
    
    @Bean
    public String name(){
        return "Raghav";
    }
    @Bean

    public person person(){
        var person=new person("Shub",29);
        return person;
    }
    @Bean
    public address Address(){
        var address=new address("kailesh","Deoband");
        return address;
    }
    
}
