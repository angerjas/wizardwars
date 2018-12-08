package com.wizard;

import java.util.ArrayList;
import java.util.List;

/**
 *  Task 1:
 *  Wizard class must have fields.
 *  A wizard must have health, money, name, surname
 *  Money and health is 100 from the beginning.
 *  If another class will create instance of Wizard; wizard class must provide data about all these (hint:use getters and setters) when we request from other class.
 *
 *  Please check what is class and what is class field/variable
 *  https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html
 *  http://tutorials.jenkov.com/java/fields.html
 *
 */
public class Wizard {

    private int health = 100;
    private int money = 100;
    private String name;
    private String surename;
    List<String> listOfSpellsWizardOwns = new ArrayList<>();

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public List<String> getListOfSpellsWizardOwns() {
        return listOfSpellsWizardOwns;
    }

    public void setListOfSpellsWizardOwns(List<String> listOfSpellsWizardOwns) {
        this.listOfSpellsWizardOwns = listOfSpellsWizardOwns;
    }
}
