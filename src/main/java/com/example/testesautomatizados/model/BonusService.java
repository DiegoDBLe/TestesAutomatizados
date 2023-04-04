package com.example.testesautomatizados.model;

public class BonusService {

    public double calcularBonus(Funcionario funcionario, int roupasVendidas){
        double bonus = 0;

        if (funcionario.getCargo().equals(Cargo.VENDEDOR)) {
            if (roupasVendidas > 20) {
                bonus = 0.05;
            }

            if (roupasVendidas > 30) {
                bonus = 0.10;
            }
        }
        return funcionario.getSalario() * bonus;
    }
}
