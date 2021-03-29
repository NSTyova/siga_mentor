package ao.co.temmais.arquitetura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ao.co.temmais.arquitetura.modelo.ExameEletronica;

@Repository
public interface ExameElectronicaRepository extends JpaRepository<ExameEletronica, Long> {

	@Query("Select el From ExameEletronica el join el.codigo_usuario u where u.email = :email")
	List<ExameEletronica> findAllByCodigo_usuario(String email);

}
