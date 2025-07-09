package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        // Ingresso nello shop
        System.out.println("Benvenuto nel Mike's java inheritance shop!");

        // Sezione Tessera
        System.out.println("Possiedi una tessera fedeltà? ( inserisci 'y' per confermare 'n' per negare)");
        Scanner scan = new Scanner(System.in);
        boolean isFidelityPresent = false;
        String fidelityCard;
        do {
            fidelityCard = scan.nextLine();
            if (fidelityCard.equalsIgnoreCase("y")) {
                System.out.println("Prego, inserisci di seguito il numero della tua tessera : ");
                String fidelityCardNumber = scan.nextLine();
                System.out.println("Bentornato, tessera numero: " + fidelityCardNumber);
                isFidelityPresent = true;
            } else if (fidelityCard.equalsIgnoreCase("n")) {
                System.out.println("Tessera non presente...");
                isFidelityPresent = false;
            } else {
                System.out.println("Inserisci un valore tra 'y' e 'n' per continuare...");
            }
        } while (!(fidelityCard.equalsIgnoreCase("y") || fidelityCard.equalsIgnoreCase("n")));

        // Selezione tipo prodotto (smartphone - TV - cuffie)
        System.out.println(
                "\n Stai acquistando: Smartphone, TV o Cuffie? (puoi anche digitare 1, 2 o 3 per le rispettive sezioni)");
        String prodottoCarrello = scan.nextLine();

        // Sezione Smartphone
        if (prodottoCarrello.equalsIgnoreCase("smartphone") || prodottoCarrello.equals("1")) {
            System.out.println("Benvenuto nella sezione Smartphone");
            System.out.println(
                    "Stai cercando uno smartphone Apple o Samsung? (puoi anche digitare 1 o 2 per la rispettiva marca)");
            String marcaSmartphone;
            do {
                marcaSmartphone = scan.nextLine();
                if (marcaSmartphone.equalsIgnoreCase("apple") || marcaSmartphone.equals("1")) {
                    System.out.println("Sezione Apple\n Seleziona modello (12, 13, 14, 15)");
                    String modello;
                    do {
                        modello = scan.nextLine();
                        if (modello.equals("12") || modello.equals("13") || modello.equals("14")
                                || modello.equals("15")) {
                            BigDecimal price;

                            switch (modello) {
                                case "12":
                                    price = new BigDecimal(699);
                                    break;
                                case "13":
                                    price = new BigDecimal(799);
                                    break;
                                case "14":
                                    price = new BigDecimal(899);
                                    break;
                                case "15":
                                    price = new BigDecimal(999);
                                    break;
                                default:
                                    price = new BigDecimal(0);
                                    break;
                            }
                            System.out.println("Memoria desiderata? 16GB - 32GB - 64GB");
                            int memoria;
                            do {
                                memoria = scan.nextInt();
                                if (memoria == 16 || memoria == 32 || memoria == 64) {
                                    Smartphone IPhone = new Smartphone("Iphone" + modello, "Apple", price, 12345,
                                            memoria);
                                    System.out.println(IPhone.getInfo());
                                    if (isFidelityPresent == true && memoria > 32) {
                                        System.out.println(
                                                "[Sconto Base tesserati : 2%] \nPrezzo finale scontato : \n "
                                                        + IPhone.getDiscountBase().setScale(2, RoundingMode.HALF_UP)
                                                        + " Euro (prezzo comprensivo di IVA)");
                                    } else if (isFidelityPresent == true && memoria <= 32) {
                                        System.out.println(
                                                "[Per Smartphone con memoria di 32 GB o inferiore lo sconto fedeltà sale al : 5%] \nPrezzo finale scontato : \n "
                                                        + IPhone.getDiscountCinque().setScale(2, RoundingMode.HALF_UP)
                                                        + " Euro (prezzo comprensivo di IVA)");
                                    }
                                } else {
                                    System.out.println("Memoria non disponibile, riprova");
                                }
                            } while (!(memoria == 16 || memoria == 32 || memoria == 64));

                        } else {
                            System.out.println("Modello non valido o non presente");
                        }
                    } while (!(modello.equals("12") || modello.equals("13") || modello.equals("14")
                            || modello.equals("15")));
                } else if (marcaSmartphone.equalsIgnoreCase("samsung") || marcaSmartphone.equals("2")) {
                    System.out.println("Sezione Samsung\n Seleziona modello (A21, A22, A23, A24)");
                    String modello;
                    do {
                        modello = scan.nextLine();
                        if (modello.equalsIgnoreCase("a21") || modello.equalsIgnoreCase("a22")
                                || modello.equalsIgnoreCase("a23")
                                || modello.equalsIgnoreCase("a24")) {
                            BigDecimal price;

                            switch (modello) {
                                case "a21":
                                    price = new BigDecimal(399);
                                    break;
                                case "a22":
                                    price = new BigDecimal(449);
                                    break;
                                case "a23":
                                    price = new BigDecimal(549);
                                    break;
                                case "a24":
                                    price = new BigDecimal(689);
                                    break;
                                default:
                                    price = new BigDecimal(0);
                                    break;
                            }
                            System.out.println("Memoria desiderata? 16GB - 32GB - 64GB -128GB");
                            int memoria;
                            do {
                                memoria = scan.nextInt();
                                if (memoria == 16 || memoria == 32 || memoria == 64 || memoria == 128) {
                                    Smartphone Samsung = new Smartphone("Galaxy " + modello.toUpperCase(), "Samsung",
                                            price, 12345,
                                            memoria);
                                    System.out.println(Samsung.getInfo());
                                } else {
                                    System.out.println("Memoria non disponibile, riprova");
                                }
                            } while (!(memoria == 16 || memoria == 32 || memoria == 64 || memoria == 128));

                        } else {
                            System.out.println("Modello non valido o non presente");
                        }
                    } while (!(modello.equals("a21") || modello.equals("a22") || modello.equals("a23")
                            || modello.equals("a24")));
                } else {
                    System.out.println(
                            "Scegli uno tra Apple o Samsung (puoi anche digitare 1 o 2 per la rispettiva sezione)");
                }

            } while (!(marcaSmartphone.equalsIgnoreCase("apple") || marcaSmartphone.equals("1")
                    || marcaSmartphone.equalsIgnoreCase("samsung") || marcaSmartphone.equals("2")));

        }

        // Sezione Tv
        else if (prodottoCarrello.equalsIgnoreCase("tv") || prodottoCarrello.equals("2")) {
            System.out.println("Benvenuto nella sezione TV");
        }

        // Sezione Cuffie
        else if (prodottoCarrello.equalsIgnoreCase("cuffie") || prodottoCarrello.equals("3")) {
            System.out.println("Benvenuto nella sezione Cuffie");
        }

        // Prodotto non trovato
        else {
            System.out
                    .println(
                            "Prodotto non presente...\n - Inserisci una categoria tra Smartphone (1), TV(2) o Cuffie(3)");
        }

        // Chiusura Scanner
        scan.close();
    }
}
