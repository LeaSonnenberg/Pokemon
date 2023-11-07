package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class Player {
    private String name;

    private String[] pokemonName = {"Quapsel", "Abra", "Enton"};

    public Player(String name){
        this.name = name;
    }

    public String pokemonName(){
        return Arrays.toString(pokemonName);
    }

    public String getName() {
        return name;
    }
}

