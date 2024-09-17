package ProductosABS.service;

import java.sql.SQLException;

import ProductosABS.dto.ProductDto;
import ProductosABS.ProductDao.ProductDao;

public class ProductService {

	private ProductDao dao= new ProductDao();

	public String insertProduct(ProductDto product) {

		try {
			dao.createProduct(product);
		} catch (SQLException e) {
			return "Error en la query a BBDD";
		}

		return "El alta se ha realizado";
	}

}