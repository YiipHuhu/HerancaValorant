package com.Unipar.HerancaValorant.Account;

import com.Unipar.HerancaValorant.Game.BibliotecaDeAgentes;

public class Valorant extends RiotAccount {
    private BibliotecaDeAgentes agentesDisponivel;
    private int passeDeBatalha;
    private int VP;//moedas
    private int Radianita;//moedas
        public BibliotecaDeAgentes getAgentesDisponivel() {
        return agentesDisponivel;
    }

    public void setAgentesDisponivel(BibliotecaDeAgentes agentesDisponivel) {
        this.agentesDisponivel = agentesDisponivel;
    }

    public int getPasseDeBatalha() {
        return passeDeBatalha;
    }

    public void setPasseDeBatalha(int passeDeBatalha) {
        this.passeDeBatalha = passeDeBatalha;
    }

    public int getVP() {
        return VP;
    }

    public void setVP(int VP) {
        this.VP = VP;
    }

    public int getRadianita() {
        return Radianita;
    }

    public void setRadianita(int radianita) {
        Radianita = radianita;
    }
}
