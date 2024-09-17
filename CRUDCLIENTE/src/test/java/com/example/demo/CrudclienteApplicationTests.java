package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootTest
class CrudclienteApplicationTests {
	
	@Autowired
	ClienteRepository clienteRepository;

	@Test
	void contextLoads() {
		
		
		//CREATE
		
		Cliente cliente = new Cliente();	
		cliente.setName("prueba");
		cliente.setDni("456789098F");
		
		clienteRepository.save(cliente);
		
		//FIND ALL
		
		//clienteRepository.findAll();

	}

}
