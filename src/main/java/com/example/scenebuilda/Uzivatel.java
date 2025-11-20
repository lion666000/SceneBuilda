package com.example.scenebuilda;

import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.time.LocalDate;
import java.util.ArrayList;


public class Uzivatel {
    private String jmeno;
    private String prijmeni;
    private LocalDate datumNarozeni;
    private String login;
    private String heslo;
    private Color barva;
    private Jazyky jazyky;
    private int pocetJazyku;


    public Uzivatel(String jmeno, String prijmeni, LocalDate datumNarozeni, String login, String heslo, Color barva, Jazyky jazyky) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
        this.login = login;
        this.heslo = heslo;
        this.barva = barva;
        this.jazyky = jazyky;
    }

    public void setPocetJazyku(int pocetJazyku) {
        this.pocetJazyku = pocetJazyku;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public int getPocetJazyku() {
        return pocetJazyku;
    }

    @Override
    public String toString() {
        return "Uzivatel{" +
                "jmeno=" + jmeno +
                ", prijmeni=" + prijmeni +
                ", datumNarozeni=" + datumNarozeni +
                ", login=" + login +
                ", heslo=" + heslo +
                ", oblibena barva=" + barva +
                ", jazyky=" + jazyky.toString() +
                '}';
    }
}
