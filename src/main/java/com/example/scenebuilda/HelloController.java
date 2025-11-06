package com.example.scenebuilda;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField jmeno;

    @FXML
    private TextField prijmeni;

    @FXML
    private DatePicker datumNarozeni;

    @FXML
    private TextField login;

    @FXML
    private CheckBox aj;

    @FXML
    private CheckBox cj;

    @FXML
    private CheckBox ne;

    @FXML
    private CheckBox sp;

    @FXML
    private TextArea poznamky;

    @FXML
    private RadioButton souhlasAno;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onRegisterButtonClick() {
        if (souhlasAno.isSelected()) {
            poznamky.setStyle("-fx-text-color: black;");
            int pocetOvladanychJazyku = 0;
            if (aj.isSelected()) {
                pocetOvladanychJazyku++;
            }
            if (cj.isSelected()) {
                pocetOvladanychJazyku++;
            }
            if (ne.isSelected()) {
                pocetOvladanychJazyku++;
            }
            if (sp.isSelected()) {
                pocetOvladanychJazyku++;
            }
            poznamky.setText("Registrace uživatele " + jmeno.getText() + " " + prijmeni.getText() + " s datem narození " + datumNarozeni.getValue() + " a s loginem " + login.getText() + " a s počtem ovládaných jazyků " + pocetOvladanychJazyku + " proběhla úspěšně.");
        }
        else {
            poznamky.setStyle("-fx-text-color: red;");
            poznamky.setText("Uživatele nelze registrovat");
        }

    }
}