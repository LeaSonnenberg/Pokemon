package org.example;

public class Game {

    public void Game(UI ui){

    }
    public static void main (String[] args){
        Pokemon duflor = StarterPokemon.duflor;
        UI ui = new ConsolenUI();
        Player player = new Player(ui.getUserInput("Wie heißt du? "));
        Player waehlePokemonAus = new Player(ui.getUserInput("Welches Pokemon möchtest du wählen? "));
        player.waehlePokemonAus();
    }
}



//player.setPokemon(duflor);
//        ui.displayPokemon(duflor);

