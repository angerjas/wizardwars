package com.wizard;

import java.util.Random;

public class SpellUtilities {
    Random random = Random;

    public int castFlame(){
        int castRate = random.nextInt(100);
        if(castRate<70){
            System.out.println("Lacarnum Inflamare casted");
            return getRandomNumberinRange(10,25);

        }
        System.out.println("* ***   Lacarnum Inflamare didn't damage, your spell has failed   *** *");
        return 0;
    }

    private int getRandomNumberinRange(int min, int max){
        if(min >= max){
            System.out.println("!!*  Maximum has to bee  g r e a t e r  than minimum  *!!");
            return 0;
        }
        int numberGenerated = random.nextInt(max - min + 1);
        return numberGenerated + min;
    }

}
