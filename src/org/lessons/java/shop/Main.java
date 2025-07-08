package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto acqua = new Prodotto("Brio blu", "Ferrarelle", new BigDecimal(3.99), new BigDecimal(0.22));
        System.out.println(acqua.getPrezzoBase());
        System.out.println(acqua.getInfo());
    }
}
