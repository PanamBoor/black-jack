package org.itstep.blackjack.event;

import org.itstep.blackjack.card.Card;

public interface GameEventListener {
    void gamesStart();
    void stand();
    void playerGetCard(Card card,int points);
    void dealerGetCard(Card card,int points);
    void playerSetBet(int amount);
    void gameOver(String winner,int playerPoints,int dealerPoints);

}
