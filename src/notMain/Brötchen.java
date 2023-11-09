package org.example;


import java.util.ArrayList;
import java.util.List;

public class Brötchen extends Essen{
    private ArrayList<Essen> belag;


    public Brötchen(String namen) {
        super(namen);
        this.belag = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void belegen(Essen essen) {
        belag.add(essen);
    }

    public ArrayList<Essen> getBelag() {
        return belag;
    }
}
