package br.com.fiap.rentacar.entity;

import br.com.fiap.rentacar.enums.TipoCombustivelEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="TBL_AUTOMOVEL")
public class Automovel {
    @Id
    @Column(name = "ID_AUTOMOVEL")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NR_ANO_FABRICACAO")
    private Integer anoFabricacao;
    @Column(name = "NR_ANO_MODELO")
    private Integer anoModelo;
    @Column(name = "TP_COMBUSTIVEL")
    @Enumerated(EnumType.STRING)
    private TipoCombustivelEnum tipoCombustivel;
    @Transient
    private Modelo modelo;
    @Transient
    private List<Acessorio> acessorios;
}
