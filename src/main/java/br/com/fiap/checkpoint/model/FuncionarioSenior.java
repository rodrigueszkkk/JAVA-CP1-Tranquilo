package br.com.fiap.checkpoint.model;

import jakarta.persistence.Entity;

@Entity
public class FuncionarioSenior extends Funcionario {
    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        int bonusCount = getHorasTrabalhadas() / 15;
        double valorBonus = bonusCount * 50.0;
        return salarioBase + valorBonus;
    }

    @Override
    public void imprimirInformacao() {
        System.out.print("[SÊNIOR] ");
        super.imprimirInformacao();
    }
}