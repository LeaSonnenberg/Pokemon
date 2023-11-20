package org.example;

public class Game {

    private String deinPokemon;

    public void Game(UI ui) {

    }
    public static void main(String[] args) {
        UI ui = new ConsolenUI();
        Player player = new Player(ui.getUserInput("Wie heißt du? "));
        ui.displayPokemon(StarterPokemon.duflor);
        ui.displayPokemon(StarterPokemon.flegmon);
        ui.displayPokemon(StarterPokemon.zubat);
        int waehlePokemonAus = Integer.parseInt(ui.getUserInput("Welches Pokemon möchtest du wählen? (0 = Duflor, 1 = Flegmon, 2 = Zubat) "));
        if (waehlePokemonAus == 0) {
            System.out.println(player.getName() + " dein Pokemon ist " + StarterPokemon.duflor.getName());
            player.setPokemon(StarterPokemon.duflor);
            System.out.println(player.getName() + " dein Gegnerpokemon ist " + StarterPokemon.zubat.getName());
            player.setGegnerPokemon(StarterPokemon.zubat);
        } else if (waehlePokemonAus == 1) {
            System.out.println(player.getName() + " dein Pokemon ist " + StarterPokemon.flegmon.getName());
            player.setPokemon(StarterPokemon.flegmon);
            System.out.println(player.getName() + " dein Gegnerpokemon ist " + StarterPokemon.duflor.getName());
            player.setGegnerPokemon(StarterPokemon.duflor);
        } else if (waehlePokemonAus == 2) {
            System.out.println(player.getName() + " dein Pokemon ist " + StarterPokemon.zubat.getName());
            player.setPokemon(StarterPokemon.zubat);
            System.out.println(player.getName() + " dein Gegnerpokemon ist " + StarterPokemon.flegmon.getName());
            player.setGegnerPokemon(StarterPokemon.flegmon);
        } else {
            System.out.println("Ungültige Eingabe. Bitte versuchen Sie es erneut.");
        }
    }
}
//displayPokemon zum anzeigen von allen DAten von einem Pokemon nutzeen

//player.setPokemon(duflor);
//        ui.displayPokemon(duflor);

