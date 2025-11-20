package com.example.scenebuilda;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

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
    private PasswordField password;

    @FXML
    private ColorPicker color;

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

    private ArrayList<Uzivatel> uzivatele = new ArrayList<Uzivatel>();


    @FXML
    protected void onRegisterButtonClick() {
        Boolean aJ = false;
        Boolean cJ = false;
        Boolean nE = false;
        Boolean sP = false;
        if (souhlasAno.isSelected()) {
            poznamky.setWrapText(true);
            poznamky.setStyle("-fx-text-fill: black;");
            int pocetOvladanychJazyku = 0;
            if (aj.isSelected()) {
                pocetOvladanychJazyku++;
                aJ = true;
            }
            if (cj.isSelected()) {
                pocetOvladanychJazyku++;
                cJ = true;
            }
            if (ne.isSelected()) {
                pocetOvladanychJazyku++;
                nE = true;
            }
            if (sp.isSelected()) {
                pocetOvladanychJazyku++;
                sP = true;
            }
            poznamky.setText("Registrace uživatele " + jmeno.getText() + " " + prijmeni.getText() + " s datem narození " + datumNarozeni.getValue() + " a s loginem " + login.getText() + " a s počtem ovládaných jazyků " + pocetOvladanychJazyku + " proběhla úspěšně.");

            String jmenoJav = jmeno.getText();
            String prijmeniJav = prijmeni.getText();
            String loginJav = login.getText();
            String passwordJav = password.getText();
            LocalDate datumJav = datumNarozeni.getValue();
            Color colorJav = color.getValue();

            Jazyky jazyky = new Jazyky(aJ, cJ, nE, sP);
            Uzivatel uzivatel = new Uzivatel(jmenoJav, prijmeniJav, datumJav, loginJav, passwordJav, colorJav, jazyky);
            uzivatele.add(uzivatel);
            uzivatel.setPocetJazyku(pocetOvladanychJazyku);
            for (Uzivatel u : uzivatele) {
                System.out.println(u.toString());
            }
        }
        else {
            poznamky.setWrapText(true);
            poznamky.setStyle("-fx-text-fill: red");
            poznamky.setText("Uživatele nelze registrovat");
        }

    }
    @FXML
    protected void onVypsatVsechnyButtonClick() {
        String vystup = "";
        poznamky.setWrapText(true);

        for (Uzivatel u : uzivatele) {
            vystup = vystup + "\n"  + u.toString();
        }
        poznamky.setText(vystup);
    }

    @FXML
    protected void onVypsatZajimavostiButtonClick() {
        String vystup = "";

        LocalDate nejmladsi = LocalDate.of(1, 1, 1);
        for  (Uzivatel u : uzivatele) {
            if (u.getDatumNarozeni().isAfter(nejmladsi)){
                nejmladsi = u.getDatumNarozeni();
            }
        }
        for  (Uzivatel u : uzivatele) {
            if (u.getDatumNarozeni().equals(nejmladsi)){
                vystup = vystup + "\n"  + "Nejmladší: " + u.getPrijmeni().toString();
            }
        }

        Uzivatel nejviceJazyku = uzivatele.get(0);
        for (Uzivatel u : uzivatele) {
            if (u.getPocetJazyku() >= nejviceJazyku.getPocetJazyku()) {
                nejviceJazyku = u;
            }
        }
        vystup = vystup + "\n"  + "Uživatel, který ovládá nejvíce jazyků: " + nejviceJazyku.getJmeno().toString();
        poznamky.setText(vystup);

        poznamky.setWrapText(true);
    }
}