package ao.co.temmais.arquitetura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ao.co.temmais.arquitetura.modelo.Moeda;

@Repository
public interface MoedaRepository extends JpaRepository<Moeda, Long>{

}
