package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    protected BigDecimal imeiCode;
    protected int memoria;

    public Smartphone(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, BigDecimal imeiCode,
            int memoria) {
        super(nome, marca, prezzo, iva);
        this.imeiCode = imeiCode;
        this.memoria = memoria;
    }

    // getter e setter

    public BigDecimal getImieiCode() {
        return this.imeiCode;
    }

    public void setImeiCode(BigDecimal imeiCode) {
        this.imeiCode = imeiCode;
    }

    public int getMemoria() {
        return this.memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    // metodi aggiuntivi
}
