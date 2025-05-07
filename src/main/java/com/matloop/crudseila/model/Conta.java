package com.matloop.crudseila.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Conta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Conta {

    @Id
    private String contaNumero;

    private double saldo;

    @ManyToOne
    @JoinColumn(name = "agencia_nome")
    private Agencia agencia;

    @ManyToOne
    @JoinColumn(name = "cliente_nome")
    private Cliente cliente;

    // Getters e Setters
}
