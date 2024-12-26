package com.challenge.rental_cars_spring_api.domain.dto;

import com.challenge.rental_cars_spring_api.domain.enums.EStatusPagamento;


import java.math.BigDecimal;
import java.time.LocalDate;

public record AluguelDTO(
        Long id,
        String modeloCarro,
        String nomeCliente,
        LocalDate dataAluguel,
        LocalDate dataDevolucao,
        BigDecimal valor,
        EStatusPagamento statusPagamento
) {}
