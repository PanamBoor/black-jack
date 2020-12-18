package org.itstep;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        AnchorPane rootPane = FXMLLoader.load(new URL(pathToCard("blackjack.fxml")));
        Scene scene = new Scene(rootPane);
        stage.setScene(scene);
        stage.setTitle("Black Jack");
        stage.getIcons().add(new Image("icon.png"));
        stage.setResizable(false);
        stage.show();
    }

    private String pathToCard(String cardFilename) {
        if (cardFilename == null)
            return null;
        String[] parts = cardFilename.split("/");
        return App.class.getClassLoader().getResource(parts[0]) + (parts.length == 2 ? parts[1] : "");
    }

    public static void main(String[] args) throws URISyntaxException {
        launch();
    }

}