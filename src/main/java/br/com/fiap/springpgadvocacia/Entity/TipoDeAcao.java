package br.com.fiap.springpgadvocacia.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoDeAcao")
public class TipoDeAcao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @JoinColumn(name = "nome")
    private String nome;

}
