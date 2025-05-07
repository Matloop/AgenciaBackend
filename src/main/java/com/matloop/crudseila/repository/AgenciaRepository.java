package com.matloop.crudseila.repository;

import com.matloop.crudseila.model.Agencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "agencias", path = "agencias")
public interface AgenciaRepository extends JpaRepository<Agencia, String> {
}
