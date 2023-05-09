package br.com.fiap.rentacar.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
//ou utilizar o @Data ao inves do @Getter Setter
public class Acessorio {
    private Long id;
    private String descricao;
}
