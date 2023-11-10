package org.example;



public class Game {

    private String deinPokemon;

    public void Game(UI ui) {

    }
    public static void main(String[] args) {
        UI ui = new ConsolenUI();
        Player player = new Player(ui.getUserInput("Wie heißt du? "));
        //Pokemon pokemon1 = new Pokemon(ui.displayPokemon(Pokemon duflor));
        ui.displayPokemon(StarterPokemon.duflor);
        ui.displayPokemon(StarterPokemon.flegmon);
        ui.displayPokemon(StarterPokemon.zubat);
        int waehlePokemonAus = Integer.parseInt(ui.getUserInput("Welches Pokemon möchtest du wählen? (0 = Duflor, 1 = Flegmon, 2 = Zubat) "));
        if (waehlePokemonAus == 0) {
            System.out.println(player.getName() + " dein Pokemon ist " + StarterPokemon.duflor.getName());
            player.setPokemon(StarterPokemon.duflor);
        } else if (waehlePokemonAus == 1) {
            System.out.println(player.getName() + " dein Pokemon ist " + StarterPokemon.flegmon.getName());
            player.setPokemon(StarterPokemon.flegmon);
        } else if (waehlePokemonAus == 2) {
            System.out.println(player.getName() + " dein Pokemon ist " + StarterPokemon.zubat.getName());
            player.setPokemon(StarterPokemon.zubat);
        } else {
            System.out.println("Ungültige Eingabe. Bitte versuchen Sie es erneut.");
        }
    }
}
//displayPokemon zum anzeigen von allen DAten von einem Pokemon nutzeen

//player.setPokemon(duflor);
//        ui.displayPokemon(duflor);

