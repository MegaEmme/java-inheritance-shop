package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
        public static void main(String[] args) {

                // implementazione classica Superclasse
                Prodotto acqua = new Prodotto("Brio blu", "Ferrarelle", new BigDecimal(3.99));
                System.out.println(acqua.getInfo());

                // implementazione sottoclasse Smartphone
                Smartphone Samsung = new Smartphone("Galaxy A24", "Samsung", new BigDecimal(699.99), 12345, 256);

                // System.out.print(Samsung.getInfo());
                System.out.println(Samsung.getInfo());

                // implementazione sottocasse Televisori
                Televisori Panasonic = new Televisori("Z80A", "Panasonic", new BigDecimal(659.67), "65'", true);

                System.out.print(Panasonic.getInfo());

                // implementazione sottoclasse Cuffie
                Cuffie Bose = new Cuffie("Quiet Comfort", "Bose", new BigDecimal(199.95), "Midnight Black", true);

                System.out.print(Bose.getInfo());

        }
}
