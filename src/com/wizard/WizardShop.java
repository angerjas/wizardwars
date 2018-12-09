package com.wizard;

import java.util.HashMap;


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
    private HashMap<String, Integer> spellMap = new HashMap<>();

    public WizardShop() {

        spellMap.put("Lacarnum Inflamare", 25);
        spellMap.put("Lumos Solem", 45);
        spellMap.put("Everte Statum", 45);
        spellMap.put("Arania Exumai", 50);
        spellMap.put("Bombarda", 60);
        spellMap.put("Avada Kedavra", 100);
        spellMap.put("Vulnera Sanentur", 25);

    }


        public void printAllSpells() {
            System.out.println(spellMap);
        }
        public void puy(String requestedSpell, Wizard wizard){
            if(wizard.getListOfSpellsWizardOwns().contains(requestedSpell)){
                System.out.println("** You already know this spell **");
                return;
            }
            if(!spellMap.containsKey(requestedSpell)){
                System.out.println("** This spell does not exist in this shop **");
                return;

            }
            if(wizard.getMoney() < spellMap.get(requestedSpell)){
                System.out.println("** The requested spell needs more money **");
                return;

            }

            System.out.println("***   You bought " +requestedSpell+"   ***");
            int costOfSpell = spellMap.get(requestedSpell);
            int remainingMoney = wizard.getMoney()-costOfSpell;
            wizard.setMoney(remainingMoney);
            wizard.getListOfSpellsWizardOwns().add(requestedSpell);
        }





        /**
         *      String var= hashMap.get(45);
         *         System.out.println("Value at index 2 is: "+var);
         *
         *        Remove values based on key
         *hashMap.remove(3);
         *System.out.println("Map key and values after removal:");
         *Set set2 = hashMap.entrySet();
         *Iterator iterator2 = set2.iterator();
         *while (iterator2.hasNext()) {
         *Map.Entry mentry2 = (Map.Entry) iterator2.next();
         *System.out.print("Key is: " + mentry2.getKey() + " & Value is: ");
         *System.out.println(mentry2.getValue());
         *}
         *
         */



}
