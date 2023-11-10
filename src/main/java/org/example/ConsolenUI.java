package org.example;

import java.util.Scanner;

public class ConsolenUI implements UI{
    public ConsolenUI(){
    }

    @Override
    public String getUserInput(String frage) {
        System.out.println(frage);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    @Override
    public void displayPokemon(Pokemon pokemon) {
        System.out.println("Name: " + pokemon.getName() + ", Type: " + pokemon.getType() + ", Max. Health: " + pokemon.getMaxHealth() + ", Attack: " + pokemon.getAttack() + ", Defense: " + pokemon.getDefense());
    }
}
