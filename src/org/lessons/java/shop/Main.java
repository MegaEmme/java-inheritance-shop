package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // implementazione classica Superclasse
        Prodotto acqua = new Prodotto("Brio blu", "Ferrarelle", new BigDecimal(3.99), new BigDecimal(0.22));
        System.out.println(acqua.getInfo());

        // implementazione sottoclasse Smartphone
        int imeiCode = 12345;
        int memoria = 256;

        Smartphone Samsung = new Smartphone("Galaxy A24", "Samsung", new BigDecimal(699.99), new BigDecimal(0.22),
                imeiCode, memoria);

        System.out.print(Samsung.getInfo());
        System.out.println(Samsung.infoSmartphone());

        // implementazione sottocasse Televisori

        // implementazione sottoclasse Cuffie

    }
}
