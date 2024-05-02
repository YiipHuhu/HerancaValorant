package com.Unipar.HerancaValorant.Game;

public class Mapas {
    private String nome;
    private int orbes;
    private int numBombs;
    private int diferencial; //1-portal, 2-rapel, 3-corda, 4-portao

        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getOrbes() {
        return orbes;
    }

    public void setOrbes(int orbes) {
        this.orbes = orbes;
    }

    public int getNumBombs() {
        return numBombs;
    }

    public void setNumBombs(int numBombs) {
        this.numBombs = numBombs;
    }

    public int getDiferencial() {
        return diferencial;
    }

    public void setDiferencial(int diferencial) {
        this.diferencial = diferencial;
    }
}
