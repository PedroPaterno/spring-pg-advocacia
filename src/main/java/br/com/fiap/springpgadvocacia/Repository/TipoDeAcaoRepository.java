package br.com.fiap.springpgadvocacia.Repository;

import br.com.fiap.springpgadvocacia.Entity.TipoDeAcao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDeAcaoRepository extends JpaRepository<TipoDeAcaoRepository, Long> {
}
