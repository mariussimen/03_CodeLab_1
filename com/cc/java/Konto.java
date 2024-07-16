package com.cc.java;

public class Konto {
    int kontostand = 10000;

    public Konto(int startwert) {
        if (startwert >= 0) {
            this.kontostand = startwert;
        } else {
            System.out.println("Ungültiger startwert. Kontostand auf 10000");
        }

    }

    public Konto getStarKonto() {
        return this;
    }

    // public int getKontostand() {
    // return kontostand;
    // }

    public void setKontostand(int kontostand) {
        kontostand = kontostand;
    }

}
