package com.example.animalvoice;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}

public class Chorus {
    public static void main (String [] args) {
        MakeVoice [] mv = new MakeVoice[3];
        mv[0] = new Cat();
        mv[1] = new Hyena();
        mv[2] = new Seagull();

        for (MakeVoice m : mv) {
            m.voice();
        }
    }
}