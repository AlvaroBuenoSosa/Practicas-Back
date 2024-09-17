package ProductosABS.ProductDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import ProductosABS.dto.ProductDto;


//CRUD CREATE READ UPDATE DELETE
public class ProductDao {		
	
		
	public void createProduct(ProductDto product) throws SQLException {
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProductosABS?serverTimezone=UTC&useSSL=false", "root", "17171017Aa.");
		
		String sql="INSERT INTO productos (nombre,descripcion,precio,stock,categoria) VALUES (?,?,?,?,?)";
		
		PreparedStatement stm=connection.prepareStatement(sql);
		
		stm.setString(1,product.getName());
		stm.setString(2,product.getDescription());
		stm.setDouble(3,product.getPrice());
		stm.setInt(4,product.getStock());
		stm.setString(5,product.getCategory());
		
		stm.executeUpdate();
		
		connection.close();
		
	}

}