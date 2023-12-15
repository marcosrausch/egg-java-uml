package domain;

import java.util.Set;

public class Deck {
    private final Set<Card> cards;

    public Deck(Set<Card> cards) {
        this.cards = cards;
    }
}
