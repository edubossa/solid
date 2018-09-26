package com.ews.solid.singleresponsibility;

/**
 * SRP - Single Responsibility Principle - COESÃO
 */
public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
        return funcionario.calculaSalario();
    }

}
