package org.itstep.ui;

import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import org.itstep.blackjack.card.Card;

import java.util.Random;

public class CardView extends ImageView {
    private final Card card;

    private String pathToCard(String cardFilename) {
        if (cardFilename == null)
            return null;
        String[] parts = cardFilename.split("/");
        return CardView.class.getClassLoader().getResource(parts[0]) + (parts.length == 2 ? parts[1] : "");
    }

    public CardView(Card card) {
        this.card = card;
        loadImage();
        animate(200);
    }

    private void animate(int offset) {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.millis(500));
        setTranslateX(-offset);
        transition.setByX(offset);
        transition.setNode(this);
        transition.setAutoReverse(false);
        transition.play();
    }

    private void loadImage() {
        String imagePath;
        if (card.isHide()) {
            imagePath = "cards/backside.png";
        } else {
            imagePath = "cards/" + card.getRank().getName() + "_of_" + card.getSuite().getName() + ".png";
        }

        setImage(new Image(pathToCard(imagePath)));
        setFitHeight(120);
        setPreserveRatio(true);
    }

    public Card getCard() {
        return card;
    }

    public void setHide(boolean hide) {
        card.setHide(hide);
        loadImage();
    }
}
