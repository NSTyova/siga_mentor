package ao.co.temmais.arquitetura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ao.co.temmais.arquitetura.modelo.Perguntas;

@Repository
public interface PerguntasRepository extends JpaRepository<Perguntas, Long>{

}
