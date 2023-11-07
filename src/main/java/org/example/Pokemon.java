package org.example;

public class Pokemon {
    public Pokemon(String name){
    }
    private String name;
    private String type;
    private int health;
    private int currentHealth;
    private int attack;
    private int defense;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
}