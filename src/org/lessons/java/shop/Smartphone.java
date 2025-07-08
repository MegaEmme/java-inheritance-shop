package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    private int imeiCode;
    private int memoria;

    public Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int imeiCode,
            int memoria) {
        super(nome, marca, prezzo, iva);
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
    public String infoSmartphone() {
        return super.getInfo() + "\nCodice imei : \n " + getImieiCode() + "\nGiga : \n " + getMemoria();
    }
}
