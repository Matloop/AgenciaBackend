package com.matloop.crudseila.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    private String clienteNome;

    private String clienteEndereco;
    private String clienteCidade;

    // Getters e Setters
}
