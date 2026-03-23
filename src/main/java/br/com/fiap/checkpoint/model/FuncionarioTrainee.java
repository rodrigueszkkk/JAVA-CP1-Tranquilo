package br.com.fiap.checkpoint.model;

import jakarta.persistence.Entity;

@Entity
public class FuncionarioTrainee extends Funcionario {

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + 200.0;
    }
}