// Creare la classe Prodotto che gestisce i prodotti dello shop. 

// Un prodotto è caratterizzato da:
// - codice (numero intero)
// - nome
// - marca
// - prezzo
// - iva

// Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
// - il codice prodotto sia accessibile solo in lettura
// - gli altri attributi siano accessibili sia in lettura che in scrittura

// Lo shop gestisce diversi tipi di prodotto: 
// - Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
// - Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
// - Cuffie, caratterizzate dal colore e se sono wireless o cablate

// Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.

package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // implementazione classica Superclasse
        Prodotto acqua = new Prodotto("Brio blu", "Ferrarelle", new BigDecimal(3.99), new BigDecimal(0.22));
        System.out.println(acqua.getInfo());

        // implementazione sottoclasse Smartphone
        Smartphone Samsung = new Smartphone("Galaxy A24", "Samsung", new BigDecimal(699.99), new BigDecimal(0.22),
                12345, 256);

        System.out.print(Samsung.getInfo());
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
