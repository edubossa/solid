package com.ews.solid.acoplamento;

public class Fatura {

    private double valorMensal;

    public Fatura(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }
}
