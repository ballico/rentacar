package br.com.fiap.rentacar.repository;

import br.com.fiap.rentacar.entity.Acessorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcessorioRepository extends JpaRepository<Acessorio, Long> {
    //Acessorio, Long criando o meu repository que como é da classe acessório o tipo será acessório,
    //Acessorio, Long entrar na classe acessório e ver qual o tipo do id dela
    //<NOME, TIPO>
}
