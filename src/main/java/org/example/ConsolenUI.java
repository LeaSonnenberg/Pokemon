package org.example;

import java.util.Scanner;

public class ConsolenUI implements UI{
    public ConsolenUI(){
    }

    @Override
    public String getUserInput(String frage) {
        System.out.println(frage);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        return userInput;


    }

    @Override
    public String displayPokemon(String pokemon) {
        System.out.println(pokemon);
        Scanner scanner = new Scanner(System.in);
        String pokemonName = scanner.next();
        return pokemonName;
    }
}