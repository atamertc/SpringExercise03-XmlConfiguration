package com.atamertc.iocconfigwithannotation;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

//    @Autowired
    IRunable game;

    // cons. injection
    public GameRunner(IRunable game) {
        this.game = game;
    }

    public   void run(){
         System.out.println("Oyun çalışıyor===>"+game.getClass().getSimpleName()+"-"+game.hashCode());
         game.up();
         game.down();
         game.left();
         game.right();
     }

}