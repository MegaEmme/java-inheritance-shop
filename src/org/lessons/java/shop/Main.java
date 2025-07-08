package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
        public static void main(String[] args) {

                // implementazione classica Superclasse
                Prodotto acqua = new Prodotto("Brio blu", "Ferrarelle", new BigDecimal(3.99), new BigDecimal(0.22));
                System.out.println(acqua.getInfo());

                // implementazione sottoclasse Smartphone
                Smartphone Samsung = new Smartphone("Galaxy A24", "Samsung", new BigDecimal(699.99),
                                new BigDecimal(0.22),
                                12345, 256);

                // System.out.print(Samsung.getInfo());
                System.out.println(Samsung.infoSmartphone());

                // implementazione sottocasse Televisori
                Televisori Panasonic = new Televisori("Z80A", "Panasonic", new BigDecimal(659.67), new BigDecimal(0.22),
                                "65'", true);

                System.out.print(Panasonic.getInfo());
                System.out.println(Panasonic.infoTv());

                // implementazione sottoclasse Cuffie
                Cuffie Bose = new Cuffie("Quiet Comfort", "Bose", new BigDecimal(199.95), new BigDecimal(0.22),
                                "Midnight Black", true);

                System.out.print(Bose.getInfo());
                System.out.println(Bose.infoCuffie());

        }
}
