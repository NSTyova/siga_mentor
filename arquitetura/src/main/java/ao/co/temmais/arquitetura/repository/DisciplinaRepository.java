package ao.co.temmais.arquitetura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ao.co.temmais.arquitetura.modelo.Disciplina;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{

}
