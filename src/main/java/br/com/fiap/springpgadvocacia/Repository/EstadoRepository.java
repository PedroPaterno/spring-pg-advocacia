package br.com.fiap.springpgadvocacia.Repository;

import br.com.fiap.springpgadvocacia.Entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
