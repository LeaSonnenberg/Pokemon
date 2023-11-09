package org.example.Service;

import org.example.Brötchen;
import org.example.Essen;
import org.example.controller.BrötchenController;

import java.util.ArrayList;

public class BelagService {
    public void zeigeBelagAlphabetischAn(Brötchen semmel){
       BrötchenController brötchenController = new BrötchenController();
       ArrayList<Essen> beläge = brötchenController.getBelag(semmel);
       //beläge.eigeneSortierfunktionDieWirGanzBestimmtGemachtHaben();
        for (Essen einzelnerBelag:beläge
             ) {
            System.out.println(einzelnerBelag);

        }

    }
}
