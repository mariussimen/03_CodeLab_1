package com.cc.java;

public class App {

    public static void main(String[] args) {

        Konto konto1 = new Konto(10000);
        // output("Anfangswert: " + konto1 + "€");
        output("Wert: " + konto1.getStarKonto());

        // konto1.setKontostand(2 * 10000);
        // output(Integer.toString(konto1.getKontostand()));

        System.out.println("------------");

        Konto konto2 = new Konto(10000);
        // output("Anfangswert: " + konto2 + "€");
        output("Wert: " + konto2.getStarKonto());

        // konto2.setKontostand(3 * 10000);
        // output(Integer.toString(konto2.getKontostand()));

        System.out.println("-------------");

        Konto konto3 = new Konto(10000);
        // output("Anfangswert: " + konto3 + "€");
        output("Wert: " + konto3.getStarKonto());

        // konto3.setKontostand(10 * 10000);
        // output(Integer.toString(konto3.getKontostand()));

    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}