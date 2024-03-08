package br.com.fiap.springpgadvocacia.Repository;

import br.com.fiap.springpgadvocacia.Entity.Processo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Long> {
}
