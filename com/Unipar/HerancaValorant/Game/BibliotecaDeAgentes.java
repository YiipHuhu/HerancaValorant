package com.Unipar.HerancaValorant.Game;

public class BibliotecaDeAgentes extends Agentes {
    private String agentesDisponivel;
    private float valorAgente;// valor para compra sem contrato
    private int contrato; //Liberacao de agentes e cosmeticos
    private boolean XboxGamePass; //caso SIM libera todos os agentes

    public String getAgentesDisponivel() {
        return agentesDisponivel;
    }

    public void setAgentesDisponivel(String agentesDisponivel) {
        this.agentesDisponivel = agentesDisponivel;
    }

    public float getValorAgente() {
        return valorAgente;
    }

    public void setValorAgente(float valorAgente) {
        this.valorAgente = valorAgente;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public boolean isXboxGamePass() {
        return XboxGamePass;
    }

    public void setXboxGamePass(boolean xboxGamePass) {
        XboxGamePass = xboxGamePass;
    }
}
