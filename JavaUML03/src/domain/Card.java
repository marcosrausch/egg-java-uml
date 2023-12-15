package domain;

import helper.Figures;
import helper.Type;

public class Card {
    private Type number;
    private Figures figure;

    @Override
    public String toString() {
        return "Card{" + "number=" + number + ", figure=" + figure + '}';
    }    
    
}
