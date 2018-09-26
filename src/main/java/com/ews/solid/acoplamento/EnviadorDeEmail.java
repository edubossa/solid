package com.ews.solid.acoplamento;

public class EnviadorDeEmail implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("EnviadorDeEmail.enviaEmail ==> " + nf);
    }
}
