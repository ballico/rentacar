package br.com.fiap.rentacar.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@Entity
@Table(name="TBL_ACESSORIO")
//ou utilizar o @Data ao inves do @Getter Setter
public class Acessorio {
    @Id
    @Column(name = "ID_ACESSORIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TX_DESCRICAO")
    private String descricao;
}
