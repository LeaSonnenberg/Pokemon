package org.example;

public class Player {
    private final String name;
    private Pokemon pokemon;
    private int waehlePokemonAus;


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

    public void waehlePokemonAus() {
        if (waehlePokemonAus == 0) {
            System.out.println("Dein Pokemon ist " + StarterPokemon.duflor);
        }
        else if (waehlePokemonAus == 1){
            System.out.println("Dein Pokemon ist " + StarterPokemon.flegmon);
        }
        else if (waehlePokemonAus == 2){
            System.out.println("Dein Pokemon ist " + StarterPokemon.zubat);
        }
        else {
            System.out.println("Ungültige Eingabe");
        }
    }
}
