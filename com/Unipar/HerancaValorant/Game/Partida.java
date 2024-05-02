package com.Unipar.HerancaValorant.Game;

import com.Unipar.HerancaValorant.Account.RiotAccount;

public class Partida extends ModoDeJogo {
    private RiotAccount riotID;
    private Mapas nome;
    private BibliotecaDeAgentes agentesDisponivel;
    private ModoDeJogo tipo;

    public Mapas getNome() {
        return nome;
    }

    public void setNome(Mapas nome) {
        this.nome = nome;
    }

    @Override
    public BibliotecaDeAgentes getAgentesDisponivel() {
        return agentesDisponivel;
    }

    @Override
    public void setAgentesDisponivel(BibliotecaDeAgentes agentesDisponivel) {
        this.agentesDisponivel = agentesDisponivel;
    }

    public void setTipo(ModoDeJogo tipo) {
        this.tipo = tipo;
    }
}
