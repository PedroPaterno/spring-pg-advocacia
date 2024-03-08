package br.com.fiap.springpgadvocacia.Repository;

import br.com.fiap.springpgadvocacia.Entity.Advogado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdvogadoRepository extends JpaRepository<Advogado, Long> {
}
