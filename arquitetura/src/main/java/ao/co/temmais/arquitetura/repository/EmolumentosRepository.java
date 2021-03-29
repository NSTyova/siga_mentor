package ao.co.temmais.arquitetura.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import ao.co.temmais.arquitetura.modelo.Emolumentos;
import ao.co.temmais.arquitetura.paginacaoUtil.PaginacaoUtil;

@Repository
public interface EmolumentosRepository extends JpaRepository<Emolumentos, Long>{

}
