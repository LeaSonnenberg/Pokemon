package org.example;
import java.util.Arrays;

public class Player {
    private String name;

    private String[] pokemonName = {"Quapsel", "Abra", "Enton"};

    public Player(String name){
        this.name = name;
    }

    public String pokemonName(Pokemon pokemon){
        return Arrays.toString(pokemonName);
    }

    public String getName() {
        return name;
    }
}
