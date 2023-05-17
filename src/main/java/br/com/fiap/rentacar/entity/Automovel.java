package br.com.fiap.rentacar.entity;

import br.com.fiap.rentacar.enums.TipoCombustivelEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TBL_AUTOMOVEL")
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
    @ManyToOne
    @JoinColumn(name = "ID_MODELO")
    private Modelo modelo;
    @ManyToMany
    @JoinTable(name = "TBL_REL_AUTOMOVEL_ACESSORIO",
            joinColumns = @JoinColumn(name = "ID_AUTOMOVEL"),
            inverseJoinColumns = @JoinColumn(name = "ID_ACESSORIO"))
    private List<Acessorio> acessorios;
}

//Regra eu tenho na minha locadora 1 Modelo Volks com dois carros UP
//1 modelo       pode ter N automóveis
//1 automovel só pode ter 1 modelo
//tira  inicio que vc terá o relacionamento
//N automóveis
//1 modelo

//Lista em tenho Muitos então de cara é ToMany
//1 automóvel pode ter N acessórios
//1 acessório pode estar em N automóveis
//tira  inicio que vc terá o relacionamento
//N acessórios
//N automóveis
// No N para N exite uma tabela de relação
