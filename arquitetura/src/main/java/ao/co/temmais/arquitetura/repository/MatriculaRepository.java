package ao.co.temmais.arquitetura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ao.co.temmais.arquitetura.modelo.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

	@Query("select m from Matricula m join m.usuarioInscreveu u where u.email = : email")
	List<Matricula> findAllByUsuario(String email);
}
