package br.com.fiap.springpgadvocacia.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "advogado")
public class Advogado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;

}
