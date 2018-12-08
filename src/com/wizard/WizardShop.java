package com.wizard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * **Spells n shit**
 * Lacarnum Inflamarae  = 25
 * Lumos Solem  = 45
 * Everte Statum = 45
 * Arania Exumai = 50
 * Bombarda = 60
 * Avada Kedavra = 100
 * Vulnera Sanentur = 25
 */

public class WizardShop {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(25,"Lacarnum Inflamare");
        hashMap.put(45,"Lumos Solem");
        hashMap.put(45,"Everte Statum");
        hashMap.put(50,"Arania Exumai");
        hashMap.put(60,"Bombarda");
        hashMap.put(100,"Avada Kedavra");
        hashMap.put(25,"Vulnera Sanentur");

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());


        System.out.println("**     Welcome to Wizard shop     **");
        System.out.println("Please choose a spell you would like to puy: ");
        System.out.println(" *");
    }

}
