package org.example;

public class Game {

    public void Game(UI ui){

    }
    public static void main (String[] args){
        UI ui = new ConsolenUI();
        Player player = new Player(ui.getUserInput("Wie heißt du? "));
        int waehlePokemonAus = Integer.parseInt(ui.getUserInput("Welches Pokemon möchtest du wählen? "));
        if (waehlePokemonAus == 0) {
            System.out.println("Dein Pokemon ist " + StarterPokemon.duflor.getName());
        }
        else if (waehlePokemonAus == 1){
            System.out.println("Dein Pokemon ist " + StarterPokemon.flegmon.getName());
        }
        else if (waehlePokemonAus == 2){
            System.out.println("Dein Pokemon ist " + StarterPokemon.zubat.getName());
        }
        else {
            System.out.println("Ungültige Eingabe");
        }
    }
}



//player.setPokemon(duflor);
//        ui.displayPokemon(duflor);

