package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.eoi.entity.Clientes;
import es.eoi.repository.ClientesRepository;


@SpringBootTest
class AppTests {

	@Autowired
	ClientesRepository clientesrepository;

	@Test
	void contextLoads() {
		
		//CREATE
		
		Clientes clientes = new Clientes();
		
		clientes.setName("Alvaro");
		clientes.setDni("45999146C");
		clientes.setAddress("Jilguero 32");
		
		clientesrepository.save(clientes);
	}

}
