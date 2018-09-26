package com.ews.solid.acoplamento;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EnviadorDeEmail enviadorDeEmail = new EnviadorDeEmail();
        NotaFiscalDao dao = new NotaFiscalDao();

        List<AcaoAposGerarNota> acoes = new ArrayList<>();
        acoes.add(enviadorDeEmail);
        acoes.add(dao);

        GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(acoes);
        gerador.gera(new Fatura(2500.98));
    }

}
