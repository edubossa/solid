package com.ews.solid.singleresponsibility;

public enum Cargo {

    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteECincoPorCento()),
    TESTER (new QuinzeOuVinteECincoPorCento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra) {
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }

}
