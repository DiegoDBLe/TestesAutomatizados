package com.example.testesautomatizados.service;

import com.example.testesautomatizados.model.Cargo;
import com.example.testesautomatizados.model.Funcionario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PromocaoServiceTest {

        private PromocaoService promocaoService;

        @BeforeEach
        public void setUp() {
            promocaoService = new PromocaoService();
        }

        @AfterEach
        public void after() {
            System.out.println("Fim da execução");
        }

        @Test
        public void deveSerPromovidoPoisPossuiRequisitosNecessarios() {
            //cenário
            Funcionario funcionario = new Funcionario("Adamastor",
                    2000d,
                    LocalDate.of(2022, 3, 5),
                    Cargo.VENDEDOR,
                    21000d);


            //execução
            boolean vendedorElegivelPromocao = promocaoService.isVendedorElegivelPromocao(funcionario);

            //verificação
            assertEquals(Cargo.VENDEDOR, funcionario.getCargo());
            assertTrue(vendedorElegivelPromocao);
        }

        @Test
        public void naoDeveSerPromovidoPoisNaoTemUmAnoDeFirma() {
            //cenário
            Funcionario funcionario = new Funcionario("Valbigésio", 2000d,
                    LocalDate.of(2022, 6, 5),
                    Cargo.VENDEDOR,
                    21000d);

            //execução
            boolean vendedorElegivelPromocao = promocaoService.isVendedorElegivelPromocao(funcionario);

            //verificação
            assertFalse(vendedorElegivelPromocao);
        }
}
