package main;

import helper.Figures;

public class Main {

    public static void main(String[] args) {
        Figures[] figures = Figures.values();
        
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i]);
        }
    }
    
}
