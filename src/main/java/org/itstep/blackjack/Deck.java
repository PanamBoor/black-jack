package org.itstep.blackjack;

import org.itstep.blackjack.card.Card;
import org.itstep.blackjack.card.Rank;
import org.itstep.blackjack.card.Suite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards;
    private final List<Card> taken;

    public Deck() {
        cards = new ArrayList<>();
        for (Suite s : Suite.values()) {
            for (Rank r : Rank.values()) {
                cards.add(new Card(r, s));
            }
        }
        taken = new ArrayList<>();
    }

    public void shuffle() {
        reset();
        Collections.shuffle(cards);
    }

    public Card getOne() {
        Card card = cards.remove(0);
        taken.add(card);
        return card;
    }

    public void reset() {
        cards.addAll(taken);
        taken.clear();
    }

}
