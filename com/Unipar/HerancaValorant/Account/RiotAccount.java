package com.Unipar.HerancaValorant.Account;

public class RiotAccount {
    private String riotID;
    private int jogo;
    // 1- Valorant, 2-Teamfight tactics, 3-Legends of Runneterra, 4- League of Legends.
    public String getRiotID() {
        return riotID;
    }

    public void setRiotID(String riotID) {
        this.riotID = riotID;
    }

    public int getJogo() {
        return jogo;
    }

    public void setJogo(int jogo) {
        this.jogo = jogo;
    }
}
