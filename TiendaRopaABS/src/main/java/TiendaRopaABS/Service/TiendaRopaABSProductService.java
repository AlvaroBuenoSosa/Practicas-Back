package TiendaRopaABS.Service;

import java.sql.SQLException;

import TiendaRopaABS.ProductDao.TiendaRopaABSProductDao;
import TiendaRopaABS.Dto.TiendaRopaABSProductDto;

public class TiendaRopaABSProductService {
	
	private TiendaRopaABSProductDao dao= new TiendaRopaABSProductDao();

	public String insertProduct(TiendaRopaABSProductDto ropa) {

		try {
			dao.createProduct(ropa);
		} catch (SQLException e) {
			return "Error en la query a BBDD";
		}

		return "El alta se ha realizado";
	}

}
