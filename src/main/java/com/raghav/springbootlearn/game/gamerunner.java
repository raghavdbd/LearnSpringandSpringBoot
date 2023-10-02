package com.raghav.springbootlearn.game;

public class gamerunner {
   private  gameconsole game;

    public gamerunner(gameconsole mario){
        game=mario;
    }
    public void run(){
    System.out.println("mario is running" + game);
}
    
}

