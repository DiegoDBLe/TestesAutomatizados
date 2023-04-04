package com.example.testesautomatizados.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Funcionario {

    private String nome;
    private Double salario;
    private LocalDate dataAdmissao;
    private Cargo cargo;
    private Double vendas;

    public Funcionario() {}

    public Funcionario(String nome, Double salario, LocalDate dataAdmissao, Cargo cargo, Double vendas) {
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.vendas = vendas;
    }
}
