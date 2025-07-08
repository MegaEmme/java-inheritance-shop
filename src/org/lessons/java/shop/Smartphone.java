package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    private int imeiCode;
    private int memoria;

    protected Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int imeiCode,
            int memoria) {
        super(nome, marca, prezzo, iva);
        this.imeiCode = imeiCode;
        this.memoria = memoria;
    }

    // getter e setter

    protected int getImieiCode() {
        return this.imeiCode;
    }

    protected void setImeiCode(int imeiCode) {
        this.imeiCode = imeiCode;
    }

    protected int getMemoria() {
        return this.memoria;
    }

    protected void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    // metodi aggiuntivi

    protected String infoSmartphone() {
        return String.format("Codice IMEI: %d, Memoria disponibile: %d GB", this.imeiCode, this.memoria);
    }
}
