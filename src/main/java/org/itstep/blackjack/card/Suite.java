package org.itstep.blackjack.card;

public enum Suite {
    CLUBS, DIAMONDS, HEARTS, SPADES;

    public String getName() {
        return this.toString().toLowerCase();
    }
}
