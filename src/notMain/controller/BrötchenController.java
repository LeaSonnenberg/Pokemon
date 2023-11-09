package org.example.controller;

import org.example.Brötchen;
import org.example.Essen;

import java.util.ArrayList;
import java.util.List;

public class BrötchenController {
    public ArrayList<Essen> getBelag(Brötchen brötchen) {

        return new ArrayList<>(brötchen.getBelag());
    }
}
