package com.raghav.springbootlearn;

import com.raghav.springbootlearn.game.gamerunner;
import com.raghav.springbootlearn.game.marioclass;

public class basicjavagameclass {


    public static void main(String args[]){
            var marioclass=new marioclass();
        var gamerunner1= new gamerunner(marioclass); 

        gamerunner1.run();
        

    



    }
    
}
