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
                            System.out.println("Memoria desiderata? (16GB - 32GB - 64GB)");
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
                            System.out.println("Memoria desiderata? (16GB - 32GB - 64GB -128GB)");
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
            System.out.println(
                    "Stai cercando una TV LG o Panasonic? (puoi anche digitare 1, 2 per la rispettiva marca)");
            String marcaTv;
            do {
                marcaTv = scan.nextLine();
                if (marcaTv.equalsIgnoreCase("lg") || marcaTv.equals("1")) {
                    System.out.println("Sezione LG\n Seleziona modello (C5 (no Smart), M5, G5)");
                    String modello;
                    do {
                        modello = scan.nextLine();
                        if (modello.equalsIgnoreCase("c5") || modello.equalsIgnoreCase("g5")
                                || modello.equalsIgnoreCase("m5")) {
                            BigDecimal price;
                            boolean isSmart;
                            switch (modello) {
                                case "c5":
                                    price = new BigDecimal(800);
                                    isSmart = false;
                                    break;
                                case "g5":
                                    price = new BigDecimal(1000);
                                    isSmart = true;
                                    break;
                                case "m5":
                                    price = new BigDecimal(1200);
                                    isSmart = true;
                                    break;
                                default:
                                    price = new BigDecimal(0);
                                    isSmart = false;
                                    break;
                            }
                            System.out.println("Seleziona dimensioni (50', 60', 65')");
                            String dimensioni;
                            do {
                                dimensioni = scan.nextLine();
                                if (dimensioni.equalsIgnoreCase("50") || dimensioni.equalsIgnoreCase("60")
                                        || dimensioni.equalsIgnoreCase("65")) {
                                    BigDecimal priceDimensioni;
                                    switch (dimensioni) {
                                        case "50":
                                            priceDimensioni = new BigDecimal(20);
                                            break;
                                        case "60":
                                            priceDimensioni = new BigDecimal(50);
                                            break;
                                        case "65":
                                            priceDimensioni = new BigDecimal(200);
                                            break;
                                        default:
                                            priceDimensioni = new BigDecimal(0);
                                            break;
                                    }
                                    BigDecimal finalPrice = price.add(priceDimensioni);
                                    Televisori LG = new Televisori("LG " + modello.toUpperCase(), "Panasonic",
                                            finalPrice,
                                            dimensioni,
                                            isSmart);
                                    System.out.println(LG.getInfo());
                                    if (isFidelityPresent && !isSmart) {
                                        System.out.println(
                                                "[Per TV non dotati di funzionalità smart lo sconto fedeltà sale al : 10%] \nPrezzo finale scontato : \n "
                                                        + LG.getDiscountDieci().setScale(2, RoundingMode.HALF_UP)
                                                        + " Euro (prezzo comprensivo di IVA)");
                                    } else if (isFidelityPresent) {
                                        System.out.println(
                                                "[Sconto Base tesserati : 2%] \nPrezzo finale scontato : \n "
                                                        + LG.getDiscountBase().setScale(2, RoundingMode.HALF_UP)
                                                        + " Euro (prezzo comprensivo di IVA)");
                                    }
                                } else {
                                    System.out.println("Dimensioni non disponibili, riprova");
                                }
                            } while (!(dimensioni.equalsIgnoreCase("50") || dimensioni.equalsIgnoreCase("60")
                                    || dimensioni.equalsIgnoreCase("65")));
                        } else {
                            System.out.println("Modello non disponbile, riprova");
                        }
                    } while (!(modello.equals("c5") || modello.equals("g5") || modello.equals("m5")));
                } else if (marcaTv.equalsIgnoreCase("panasonic") || marcaTv.equals("2")) {
                    System.out.println("Sezione Panasonic\n Seleziona modello (Z80B (no Smart), Z90B, Z95B)");
                    String modello;
                    do {
                        modello = scan.nextLine();
                        if (modello.equalsIgnoreCase("z80b") || modello.equalsIgnoreCase("z90b")
                                || modello.equalsIgnoreCase("z95b")) {
                            BigDecimal price;
                            boolean isSmart;
                            switch (modello) {
                                case "z80b":
                                    price = new BigDecimal(649.99);
                                    isSmart = false;
                                    break;
                                case "z90b":
                                    price = new BigDecimal(869.99);
                                    isSmart = true;
                                    break;
                                case "z95b":
                                    price = new BigDecimal(1099.99);
                                    isSmart = true;
                                    break;
                                default:
                                    price = new BigDecimal(0);
                                    isSmart = false;
                                    break;
                            }
                            System.out.println("Seleziona dimensioni (43', 52', 75')");
                            String dimensioni;
                            do {
                                dimensioni = scan.nextLine();
                                if (dimensioni.equalsIgnoreCase("43") || dimensioni.equalsIgnoreCase("52")
                                        || dimensioni.equalsIgnoreCase("75")) {
                                    BigDecimal priceDimensioni;
                                    switch (dimensioni) {
                                        case "43":
                                            priceDimensioni = new BigDecimal(20);
                                            break;
                                        case "52":
                                            priceDimensioni = new BigDecimal(50);
                                            break;
                                        case "75":
                                            priceDimensioni = new BigDecimal(200);
                                            break;
                                        default:
                                            priceDimensioni = new BigDecimal(0);
                                            break;
                                    }
                                    BigDecimal finalPrice = price.add(priceDimensioni);
                                    Televisori Panasonic = new Televisori("Panasonic " + modello.toUpperCase(),
                                            "Panasonic", finalPrice, dimensioni, isSmart);
                                    System.out.println(Panasonic.getInfo());
                                    if (isFidelityPresent && !isSmart) {
                                        System.out.println(
                                                "[Per TV non dotati di funzionalità smart lo sconto fedeltà sale al : 10%] \nPrezzo finale scontato : \n "
                                                        + Panasonic.getDiscountDieci().setScale(2, RoundingMode.HALF_UP)
                                                        + " Euro (prezzo comprensivo di IVA)");
                                    } else if (isFidelityPresent) {
                                        System.out.println(
                                                "[Sconto Base tesserati : 2%] \nPrezzo finale scontato : \n "
                                                        + Panasonic.getDiscountBase().setScale(2, RoundingMode.HALF_UP)
                                                        + " Euro (prezzo comprensivo di IVA)");
                                    }
                                }
                            } while (!(dimensioni.equalsIgnoreCase("43") || dimensioni.equalsIgnoreCase("52")
                                    || dimensioni.equalsIgnoreCase("75")));
                        }
                    } while (!(modello.equals("z80b") || modello.equals("z90b") || modello.equals("z95b")));
                } else {
                    System.out.println(
                            "Inserisci uno tra LG e Panasonic (puoi anche digitare 1 o 2 per la rispettiva sezione)");
                }
            } while (!(marcaTv.equalsIgnoreCase("lg") || marcaTv.equals("1")
                    || marcaTv.equalsIgnoreCase("panasonic") || marcaTv.equals("2")));
        }

        // Sezione Cuffie
        else if (prodottoCarrello.equalsIgnoreCase("cuffie") || prodottoCarrello.equals("3")) {
            System.out.println("Benvenuto nella sezione Cuffie");
            System.out.println(
                    "Digita il nome del modello di cuffie che stai cercando : ");
            String modelloCuffie = scan.nextLine();
            System.out.println("Inserisci marca cuffie");
            String marcaCuffie = scan.nextLine();
            System.out.println("Inserisci colore");
            String coloreCuffie = scan.nextLine();
            BigDecimal prezzo;
            boolean inputPrezzoValido;
            do {
                System.out.println("Scegli fascia di prezzo (50, 100, 200)");
                prezzo = scan.nextBigDecimal();
                if (prezzo.compareTo(new BigDecimal(50)) == 0 ||
                        prezzo.compareTo(new BigDecimal(100)) == 0 ||
                        prezzo.compareTo(new BigDecimal(200)) == 0) {
                    inputPrezzoValido = true;
                } else {
                    System.out.println("Fascia di prezzo non valida. Puoi inserire solo 50, 100 o 200. Riprova:");
                    inputPrezzoValido = false;
                }
            } while (!inputPrezzoValido);

            System.out.println("Wireless? (true or false)");
            boolean isWireless = false;
            String wireless;
            do {
                wireless = scan.nextLine();
                if (wireless.equalsIgnoreCase("true") || wireless.equals("1")) {
                    isWireless = true;
                } else if (wireless.equalsIgnoreCase("false") || wireless.equals("0")) {
                    isWireless = false;
                } else {
                    System.out.println("puoi inserire solo true or false (oppure 1 o 0). Riprova");
                }
            } while (!(wireless.equalsIgnoreCase("true") || wireless.equals("1") || wireless.equalsIgnoreCase("false")
                    || wireless.equals("0")));

            Cuffie cuffie = new Cuffie(modelloCuffie, marcaCuffie, prezzo, coloreCuffie, isWireless);
            System.out.println(cuffie.getInfo());
            if (isFidelityPresent && !isWireless) {
                System.out.println(
                        "[Per cuffie cablate lo sconto fedeltà sale al : 7%] \nPrezzo finale scontato : \n "
                                + cuffie.getDiscountSette().setScale(2, RoundingMode.HALF_UP)
                                + " Euro (prezzo comprensivo di IVA)");
            } else if (isFidelityPresent) {
                System.out.println(
                        "[Sconto Base tesserati : 2%] \nPrezzo finale scontato : \n "
                                + cuffie.getDiscountBase().setScale(2, RoundingMode.HALF_UP)
                                + " Euro (prezzo comprensivo di IVA)");
            }

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
