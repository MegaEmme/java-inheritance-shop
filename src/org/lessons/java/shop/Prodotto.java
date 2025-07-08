package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    // attributi
    private final int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva = new BigDecimal(0.22);

    // costruttori
    protected Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(9999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // getter e setter
    protected int getCodice() {
        return this.codice;
    }

    protected String getNome() {
        return this.nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getMarca() {
        return this.marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    protected BigDecimal getPrezzoBase() {
        return this.prezzo.setScale(2, RoundingMode.HALF_UP);
    }

    protected void setPrezzoBase(BigDecimal prezzoBase) {
        this.prezzo = prezzoBase;
    }

    protected BigDecimal getPrezzoIvato() {
        return prezzo.add(prezzo.multiply(iva));
    }

    protected String getInfo() {

        return String.format(
                "Stai acquistando: %s, prodotto da: %s, al costo di: %s Euro senza IVA, e di: %s Euro più IVA, Codice: %d, ",
                this.nome,
                this.marca,
                getPrezzoBase(), getPrezzoIvato().setScale(2, RoundingMode.HALF_UP), this.codice);
    }
}
