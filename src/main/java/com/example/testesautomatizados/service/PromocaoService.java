package com.example.testesautomatizados.service;

import com.example.testesautomatizados.model.Cargo;
import com.example.testesautomatizados.model.Funcionario;

import java.time.LocalDate;

public class PromocaoService {

    /*
     Para que o funcionario seja elegivel a promoção de gerente,
     deve possuir o cargo de 'Vendedor', deve possuir mais de um ano de empresa
     e deve ter vendido mais de 20.000 reais.
    * */

    public boolean isVendedorElegivelPromocao(Funcionario funcionario){
        boolean isVendedor = funcionario.getCargo().equals(Cargo.VENDEDOR);
        boolean possuiMaisDeUmAnoDeFirma = funcionario.getDataAdmissao().isBefore(LocalDate.now().minusYears(1));
        boolean vendeuMaisQueVinteMil = funcionario.getVendas() > 20000d;

        return isVendedor && possuiMaisDeUmAnoDeFirma && vendeuMaisQueVinteMil;
    }
}
