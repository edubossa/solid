package com.ews.solid.singleresponsibility;

import java.time.LocalDate;

public class Funcionario {

    private int id;
    private String nome;
    private LocalDate dataDeAdmissao;
    private Cargo cargo;
    private double salarioBase;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calculaSalario(){
        return cargo.getRegra().calcula(this);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataDeAdmissao=" + dataDeAdmissao +
                ", cargo=" + cargo +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
