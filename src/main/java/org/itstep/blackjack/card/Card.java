package org.itstep.blackjack.card;

public class Card {
    private final Rank rank;
    private final Suite suite;
    private boolean hide;

    public Card(Rank rank, Suite suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public Rank getRank() {
        return rank;
    }

    public Suite getSuite() {
        return suite;
    }

    public int getValue() {
        return rank.getValue();
    }

    public boolean isHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }

    @Override
    public String toString() {
        return "Card{" + "rank=" + rank + ", suite=" + suite + '}';
    }
}
