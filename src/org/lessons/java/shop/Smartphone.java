package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    // attributi
    private int imeiCode;
    private int memoria;

    // costruttori
    public Smartphone(String nome, String marca, BigDecimal prezzo, int imeiCode,
            int memoria) {
        super(nome, marca, prezzo);
        this.imeiCode = imeiCode;
        this.memoria = memoria;
    }

    // getter e setter
    public int getImieiCode() {
        return this.imeiCode;
    }

    public void setImeiCode(int imeiCode) {
        this.imeiCode = imeiCode;
    }

    public int getMemoria() {
        return this.memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    // metodi aggiuntivi
    @Override
    public String getInfo() {
        return super.getInfo() + "\nCodice imei : \n " + getImieiCode() + "\nGiga : \n " + getMemoria();
    }
}
