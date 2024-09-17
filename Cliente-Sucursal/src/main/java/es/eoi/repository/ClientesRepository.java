package es.eoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.eoi.entity.Clientes;

public interface ClientesRepository extends JpaRepository <Clientes,Integer> {

}
