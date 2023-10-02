package com.raghav.springbootlearn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.raghav.springbootlearn.game.marioclass;
import com.raghav.springbootlearn.game.gameconsole;

@Configuration

public class GamingConfiguration {

    @Bean
     public gameconsole gamingConsole(){
        var mario=new marioclass();
        return mario ;
    }
    
}
