package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {

    // attributi
    private String dimensioni;
    private boolean isSmart;

    // costruttori
    public Televisori(String nome, String marca, BigDecimal prezzo, String dimensioni,
            boolean isSmart) {
        super(nome, marca, prezzo);
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
    @Override
    public String getInfo() {
        String smart = isSmart ? "si" : "no";
        return super.getInfo() + "\nDimensioni : \n " + getDimensioni() + "\nSmart TV abilitato : \n " + smart;
    }
}
