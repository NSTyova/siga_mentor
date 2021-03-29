package ao.co.temmais.arquitetura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ao.co.temmais.arquitetura.modelo.GuiaPagamentoHistorico;

@Repository
public interface GuiaPagamentoHisotricoRepository extends JpaRepository<GuiaPagamentoHistorico, Long>{

	@Query("select gp from GuiaPagamentoHistorico gp join gp.usuario u where u.email = : email")
	List<GuiaPagamentoHistorico> findAllByUsuario(String email);
}
