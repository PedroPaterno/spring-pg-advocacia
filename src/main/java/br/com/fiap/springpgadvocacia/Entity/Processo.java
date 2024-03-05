package br.com.fiap.springpgadvocacia.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "processo")
public class Processo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "advogado_id")
    private Advogado advogado;

    @ManyToOne
    @JoinColumn(name = "tipo_acao_id")
    private TipoDeAcao tipoDeAcao;

}

