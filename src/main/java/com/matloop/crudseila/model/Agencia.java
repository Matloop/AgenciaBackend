package com.matloop.crudseila.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Agencia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Agencia {

    @Id
    private String agenciaNome;

    private String agenciaCidade;
    private Double ativos;

    // Getters e Setters
}
