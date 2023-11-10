package org.example;

public class Player {
    private final String name;
    private Pokemon pokemon;


    public Player(String name) {
        this.name = name;
    }


    public Pokemon getPokemon() {
        return pokemon;
    }

    public String getName() {
        return name;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

}
