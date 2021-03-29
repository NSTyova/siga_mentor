package ao.co.temmais.arquitetura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ao.co.temmais.arquitetura.modelo.Municipio;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Long> {

	@Query("SELECT m FROM Municipio m order by descricao asc")
	List<Municipio> findAll();
}
