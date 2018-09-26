package com.ews.solid.acoplamento;

public class NotaFiscalDao implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("NotaFiscalDao.persiste ==> " + nf);
    }
}
