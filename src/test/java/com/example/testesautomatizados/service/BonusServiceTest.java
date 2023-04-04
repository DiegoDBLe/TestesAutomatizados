package com.example.testesautomatizados.service;

import com.example.testesautomatizados.model.BonusService;
import com.example.testesautomatizados.model.Cargo;
import com.example.testesautomatizados.model.Funcionario;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest{
    @Test
    public void testCalcularBonusParaVendedorComMaisDe30RoupasVendidas() {
        BonusService bonusService = new BonusService();
        Funcionario vendedor = new Funcionario("Adamastor",
                2000d,
                LocalDate.of(2022, 3, 5),
                Cargo.VENDEDOR,
                21000d );
        double bonus = bonusService.calcularBonus(vendedor, 35);
        assertEquals(150.0, bonus, 0.001);
    }

    @Test
    public void testCalcularBonusParaVendedorCom20RoupasVendidas() {
        BonusService bonusService = new BonusService();
        Funcionario vendedor = new Funcionario("Pitaco",
                2000d,
                LocalDate.of(2022, 3, 5),
                Cargo.VENDEDOR,
                21000d);
        double bonus = bonusService.calcularBonus(vendedor, 20);
        assertEquals(0.0, bonus, 0.001);
    }

    @Test
    public void testCalcularBonusParaGerente() {
        BonusService bonusService = new BonusService();
        Funcionario gerente = new Funcionario("Valbigésio",
                2000d,
                LocalDate.of(2022, 3, 5),
                Cargo.VENDEDOR,
                21000d);
        double bonus = bonusService.calcularBonus(gerente, 25);
        assertEquals(0.0, bonus, 0.001);
    }
}
