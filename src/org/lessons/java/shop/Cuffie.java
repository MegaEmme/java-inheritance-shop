package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

    // attributi
    protected String colore;
    protected boolean isWireless;

    // costruttori
    public Cuffie(String nome, String marca, BigDecimal prezzo, String colore,
            boolean isWireless) {
        super(nome, marca, prezzo);
        this.colore = colore;
        this.isWireless = isWireless;

    }

    // getter e setter
    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean getIsWireless() {
        return this.isWireless;
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    // metodi aggiuntivi
    @Override
    public String getInfo() {
        String wireless = isWireless ? "si" : "no";
        // return String.format("\nColore : \n %s \nWireless : \n %s", this.colore,
        // wireless);
        return super.getInfo() + "\nColore : \n " + getColore() + "\nWireless : \n " + wireless;
    }
}
