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
    private BigDecimal iva;

    // costruttori
    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(9999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // getter e setter
    public int getCodice() {
        return this.codice;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrezzoBase() {
        return this.prezzo.setScale(2, RoundingMode.HALF_UP);
    }

    public void setPrezzoBase(BigDecimal prezzoBase) {
        this.prezzo = prezzoBase;
    }

    public BigDecimal getPrezzoIvato() {
        return prezzo.add(prezzo.multiply(iva));
    }

    public String getInfo() {

        return String.format(
                "-----------\nStai acquistando : \n %s \nprodotto da : \n %s \nal costo di : \n %s Euro senza IVA \n %s Euro più IVA \nCodice prodotto: \n %d ",
                this.nome,
                this.marca,
                getPrezzoBase(), getPrezzoIvato().setScale(2, RoundingMode.HALF_UP), this.codice);
    }
}
