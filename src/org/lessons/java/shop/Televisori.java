package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {

    private String dimensioni;
    private boolean isSmart;

    protected Televisori(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String dimensioni,
            boolean isSmart) {
        super(nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.isSmart = isSmart;
    }

    // getter e setter

    protected String getDimensioni() {
        return this.dimensioni;
    }

    protected void setDimensioni(String dimensioni) {
        this.dimensioni = dimensioni;
    }

    protected boolean getIsSmart() {
        return this.isSmart;
    }

    protected void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    // metodi aggiuntivi

    protected String infoTv() {
        String smart = isSmart ? "si" : "no";
        return String.format("Dimensioni: %s, Smart Tv: %s", this.dimensioni, smart);
    }
}
