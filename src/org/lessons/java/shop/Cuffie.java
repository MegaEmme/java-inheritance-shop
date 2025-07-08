package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

    protected String colore;
    protected boolean isWireless;

    protected Cuffie(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore,
            boolean isWireless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.isWireless = isWireless;

    }

    // getter e setter

    protected String getColore() {
        return this.colore;
    }

    protected void setColore(String colore) {
        this.colore = colore;
    }

    protected boolean getIsWireless() {
        return this.isWireless;
    }

    protected void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    // metodi aggiuntivi

    protected String infoCuffie() {
        String wireless = isWireless ? "si" : "no";
        return String.format("Colore: %s, Wireless: %s", this.colore, wireless);
    }
}
