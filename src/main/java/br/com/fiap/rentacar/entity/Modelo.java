package br.com.fiap.rentacar.entity;

import lombok.Data;

@Data
public class Modelo {
    private Long id;
    private String nome;
    private Integer potencia;
    private Marca marca;
}
