package br.com.fiap.checkpoint.model;

import br.com.fiap.checkpoint.annotation.Descricao;
import br.com.fiap.checkpoint.annotation.Tabela;
import jakarta.persistence.*;

@Entity
@Tabela(nome = "TAB_FUNCIONARIO")
@Descricao(descricao = "Tabela base para armazenamento de funcionários")
@Inheritance(strategy = InheritanceType.JOINED)
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nm_funcionario")
    private String nome;

    @Column(name = "nr_horas")
    private int horasTrabalhadas;

    @Column(name = "vl_hora")
    private double valorHora;

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, int horasTrabalhadas, double valorHora) {
        this.id = id;
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularSalario() {
        return horasTrabalhadas * valorHora; // [cite: 19]
    }

    public void imprimirInformacao() {
        System.out.println("Nome: " + nome + " | Salário: R$ " + calcularSalario()); // [cite: 19]
    }
}