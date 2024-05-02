package com.Unipar.HerancaValorant.Game;

import com.Unipar.HerancaValorant.Account.Valorant;

public class ModoDeJogo extends Valorant {
    private int tipo; //1- rankeada, 2- sem classe, 3-mata-mata, 4-disputadaSpike, 5-modo de treino.
    private int jogadorPorPartida;
    private int rounds; //numero de rodadas
    private int fimPartida; //modo de fim de partida, pode ser por 1- morte subta, 2- diferença de 2 pontos.

        public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getJogadorPorPartida() {
        return jogadorPorPartida;
    }

    public void setJogadorPorPartida(int jogadorPorPartida) {
        this.jogadorPorPartida = jogadorPorPartida;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getFimPartida() {
        return fimPartida;
    }

    public void setFimPartida(int fimPartida) {
        this.fimPartida = fimPartida;
    }
}
