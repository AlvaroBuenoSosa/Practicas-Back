package com.tiendazapatos.abs;

import java.util.List;

public interface ZapatosService {
	
	public List<Zapatos> findAll();
	
	public ZapatosDto findZapatos(int id);
	
	public void save (Zapatos zapatos);
	
	public void deleteAll();
	
	public void delete(Integer id);

}
