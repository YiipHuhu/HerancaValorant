package com.Unipar.HerancaValorant.Game;

public class Agentes {
    private String nome;
    private String habilidade1;
    private String habilidade2;
    private String habilidade3;
    private String habilidade4;
    private String passiva;
    private int pontosDeUltimate;
    private String posicao;
    private int Vida;
    private int escudo;

        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade1() {
        return habilidade1;
    }

    public void setHabilidade1(String habilidade1) {
        this.habilidade1 = habilidade1;
    }

    public String getHabilidade2() {
        return habilidade2;
    }

    public void setHabilidade2(String habilidade2) {
        this.habilidade2 = habilidade2;
    }

    public String getHabilidade3() {
        return habilidade3;
    }

    public void setHabilidade3(String habilidade3) {
        this.habilidade3 = habilidade3;
    }

    public String getHabilidade4() {
        return habilidade4;
    }

    public void setHabilidade4(String habilidade4) {
        this.habilidade4 = habilidade4;
    }

    public String getPassiva() {
        return passiva;
    }

    public void setPassiva(String passiva) {
        this.passiva = passiva;
    }

    public int getPontosDeUltimate() {
        return pontosDeUltimate;
    }

    public void setPontosDeUltimate(int pontosDeUltimate) {
        this.pontosDeUltimate = pontosDeUltimate;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }
}
