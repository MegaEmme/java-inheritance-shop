package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    // attributi
    protected final int codice;
    protected String nome;
    protected String marca;
    protected BigDecimal prezzo;
    protected BigDecimal iva;

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
        // return "Stai acquistando: " + nome + ", prodotto da: " + marca + ", al costo
        // di: " + getPrezzoBase() + " Euro"
        // + ", Codice: " + codice;
        return String.format("Stai acquistando: %s, prodotto da: %s, al costo di: %s Euro, Codice: %d ", this.nome,
                this.marca,
                getPrezzoBase(), this.codice);
    }
}
