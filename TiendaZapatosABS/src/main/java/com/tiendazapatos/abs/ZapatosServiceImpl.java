package com.tiendazapatos.abs;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ZapatosServiceImpl implements ZapatosService{
	
	@Autowired
	ZapatosRepository zapatosRepository;
	
	//Logica de la base de datos
	
	public ZapatosDto findZapatos(int id) {
		
		Zapatos entity = zapatosRepository.findById(id).get();
		
		ZapatosDto dto=new ZapatosDto();
		dto.setName(entity.getName());
		dto.setBrand(entity.getBrand());
		dto.setPrice(entity.getPrice());
		dto.setSize(entity.getSize());
		
		return dto;
	}
	
	@Override
	public List<Zapatos> findAll() {
		
		return zapatosRepository.findAll();
	}
	
	@Override
	public void save(Zapatos zapatos) {
		
		zapatosRepository.save(zapatos);
	}
	
	@Override
	public void deleteAll() {
		
		zapatosRepository.deleteAll();
		
	}

	@Override
	public void delete(Integer id) {
		
		zapatosRepository.deleteById(id);
		
	}

}
