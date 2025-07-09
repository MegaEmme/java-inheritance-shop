package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        System.out.println("Benvenuto nello shop");

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "Stai acquistando: Smartphone, TV o Cuffie? (puoi anche digitare 1, 2 o 3 per le rispettive sezioni)");

        String prodottoCarrello = scan.nextLine();

        if (prodottoCarrello.equalsIgnoreCase("smartphone") || prodottoCarrello.equals("1")) {
            System.out.println("Benvenuto nella sezione Smartphone");
            System.out.println();
        } else if (prodottoCarrello.equalsIgnoreCase("tv") || prodottoCarrello.equals("2")) {
            System.out.println("Benvenuto nella sezione TV");
        } else if (prodottoCarrello.equalsIgnoreCase("cuffie") || prodottoCarrello.equals("3")) {
            System.out.println("Benvenuto nella sezione Cuffie");
        } else {
            System.out
                    .println(
                            "Prodotto non presente...\n - Inserisci una categoria tra Smartphone (1), TV(2) o Cuffie(3)");
        }

        scan.close();

    }
}
