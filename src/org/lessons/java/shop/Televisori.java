package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {

    protected String dimensioni;
    protected boolean isSmart;

    public Televisori(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, String dimensioni,
            boolean isSmart) {
        super(nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.isSmart = isSmart;
    }

    // getter e setter

    public String getDimensioni() {
        return this.dimensioni;
    }

    public void setDimensioni(String dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean getIsSmart() {
        return this.isSmart;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    // metodi aggiuntivi
}
