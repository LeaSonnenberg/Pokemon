package org.example;

public class Player {
    private String name;

    private String[] pokemonName = {"Quapsel", "Abra", "Enton"};

    public Player(String name){
        this.name = name;
    }

    public String[] pokemonName(Pokemon pokemon){
        return pokemonName;
    }

    public String getName() {
        return name;
    }
}
