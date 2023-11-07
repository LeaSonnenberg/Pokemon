package org.example;

import java.util.Scanner;

public class ConsolenUI implements UI{
    public ConsolenUI(){
    }

    @Override
    public String getUserInput(String frage) {
        System.out.println(frage);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        return userInput;


    }
}