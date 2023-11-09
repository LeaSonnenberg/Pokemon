package org.example;

public class Pokemon {

    private String name;
    private String type;
    private int maxHealth;
    private int currentHealth;
    private int attack;
    private int defense;

    public Pokemon(String name, String type, int maxHealth, int attack, int defense) {
        this.name = name;
        this.type = type;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getMaxHealth() {
        return maxHealth;
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