package org.example;

public class Game {
    public static void main (String[] args){
        UI ui = new ConsolenUI();
        Player player = new Player(ui.getUserInput("Wie heißt du? "));

        Pokemon pokemon = new Pokemon(ui.displayPokemon("Wähle ein Pokemon aus: "));
        player.pokemonName();
    }
}