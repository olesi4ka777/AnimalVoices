package com.example.animalvoice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private Label selectedLbl;
    @FXML
    private RadioButton CatRB;

    @FXML
    private RadioButton HyeRB;

    @FXML
    private RadioButton SolRB;

    @FXML
    private Button Start;

    @FXML
    void MakeVoice(){
        ToggleGroup ans = new ToggleGroup();
        RadioButton selection = (RadioButton) ans.getSelectedToggle();
        if (selection == CatRB) {
            Cat cat = new Cat();
            selectedLbl.setText(cat.voice);
        }
        if (selection == HyeRB) {
            Hyena horse = new Hyena();
            selectedLbl.setText(Hyena.voice);
        }
        if (selection == SolRB) {
            Solovey pig = new Solovey();
            selectedLbl.setText(Solovey.voice);
        }

    }

}
