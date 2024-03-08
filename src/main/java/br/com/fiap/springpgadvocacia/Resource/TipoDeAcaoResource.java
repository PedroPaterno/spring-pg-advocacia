package br.com.fiap.springpgadvocacia.Resource;

import br.com.fiap.springpgadvocacia.Entity.TipoDeAcao;
import br.com.fiap.springpgadvocacia.Repository.TipoDeAcaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/tipo-de-acao")
public class TipoDeAcaoResource {

    @Autowired
    private TipoDeAcaoRepository tipoDeAcaoRepository;

    @GetMapping
    public List<TipoDeAcao> findAll(){return TipoDeAcaoRepository.findAll();}

    @GetMapping(value = "/{id}")
    public ResponseEntity<TipoDeAcao> findById(@PathVariable(name = "id") Long id){
        TipoDeAcao tipoDeAcao = TipoDeAcaoRepository.findById(id).orElse(null);
        if (Objects.isNull(tipoDeAcao)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tipoDeAcao);
    }


    @PostMapping
    @Transactional
    public ResponseEntity<TipoDeAcao> persist(@RequestBody TipoDeAcao tipoDeAcao){
        TipoDeAcao saved = TipoDeAcaoRepository.save(tipoDeAcao);
        return ResponseEntity.ok(saved);
    }

}
