package com.wizard;

/**
 * Task 2:
 * Every wizard must have a name and a surname. It can have middle name as much as it can.
 * Wizard names/surnames must not contain any numbers or special characters. Punct etc. (Hint: Check the last weeks class code)
 * In case error has been detected print a meaningful error stating what is the reason of not accepting surname or name.
 * When
 */
public class ChracterCreation {





    /**
     * Responsible for
     *  1.  Validating the Name
     *  2.  Print error from here if it doesn't validate. (meaningful/guiding error so user knows why it was wrong)
     */
    public boolean validateName(String firstName){
        if(firstName==null || firstName.isEmpty()){
            System.out.println("First name is not suitable. You did not enter any name");
            return false;
        }
        if(firstName.contains(" ")){
            System.out.println("First name must not contain any space");
            return false;
        }
        String filteredName = eraseNonLetters(firstName);
        if(!firstName.equalsIgnoreCase(filteredName)){
            System.out.println("First name is not suitable. No Numbers/Punctuations");
            return false;
        }
        return true;
    }

    public boolean validateSurename(String sureName){
        if(sureName==null || sureName.isEmpty()){
            System.out.println("First name is not suitable. You did not enter any name");
            return false;
        }
        String filteredName = eraseNonLetters(sureName);
        if(!sureName.equalsIgnoreCase(filteredName)){
            System.out.println("Surname is not suitable. No Numbers/Punctuations");
            return false;
        }
        return true;
    }



    private String eraseNonLetters(String word){
        String result = word.replaceAll("\\d","");
        result = result.replaceAll("\\p{Punct}","");
        return result;
    }

    /**
     * Responsible for
     *  1.  Validating the Surname (Including the middle name etc all comes here ) (Example: Murat Caliskan Something then Murat is FirstName and Caliskan Something is surname)
     *  2.  Print error from here if it doesn't validate. (meaningful/guiding error so user knows why it was wrong)
     */

}