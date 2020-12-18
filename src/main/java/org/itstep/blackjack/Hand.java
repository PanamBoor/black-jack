package org.itstep.blackjack;

import org.itstep.blackjack.card.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void reset() {
        cards.clear();
    }

    public int getValue() {
        return cards.stream().filter(c -> !c.isHide()).mapToInt(Card::getValue).sum();
    }

    public List<Card> getCards() {
        return cards;
    }

}
