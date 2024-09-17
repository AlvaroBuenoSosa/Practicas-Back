package TiendaRopaABS.ProductDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import TiendaRopaABS.Dto.TiendaRopaABSProductDto;

public class TiendaRopaABSProductDao {

	public void createProduct(TiendaRopaABSProductDto ropa) throws SQLException {

		Connection connection = getConnection();

		String sql = "INSERT INTO ropa (nombre,tipo,talla,color,precio,marca) VALUES (?,?,?,?,?,?)";

		PreparedStatement stm = connection.prepareStatement(sql);

		stm.setString(1, ropa.getName());
		stm.setString(2, ropa.getType());
		stm.setString(3, ropa.getSize());
		stm.setString(4, ropa.getColor());
		stm.setDouble(5, ropa.getPrecio());
		stm.setString(6, ropa.getMarca());

		stm.executeUpdate();

		connection.close();

	}

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/tiendaropa?serverTimezone=UTC&useSSL=false", "root", "17171017Aa.");
	}

	public TiendaRopaABSProductDto readProduct(int id) throws SQLException {

		Connection connection = getConnection();
		TiendaRopaABSProductDto product = null;

		String sql = "SELECT id,nombre,color,marca,precio FROM ropa WHERE ID=?";

		PreparedStatement stm = connection.prepareStatement(sql);

		stm.setInt(1, id);

		ResultSet rs = stm.executeQuery();

		
		while (rs.next()){
		product = new TiendaRopaABSProductDto();
		product.setId(rs.getInt("id"));
		product.setName(rs.getString("nombre"));
		product.setColor(rs.getString("color"));
		product.setMarca(rs.getString("marca"));
		product.setPrecio(rs.getDouble("precio"));
		
		}
		
		connection.close();

		return product;
	}
	
	public void updateProduct(TiendaRopaABSProductDto product) throws Exception {

		Connection connection = getConnection();

		if (product.getId() == null) {
			throw new Exception("Id no presente");
		} else {

			String sql = "UPDATE ropa SET marca=? WHERE ID=?";
			PreparedStatement stm = connection.prepareStatement(sql);
			stm.setString(1, product.getMarca());
			stm.setInt(2, product.getId());

			stm.executeUpdate();
		}

		connection.close();

	}
	
	public void deleteProduct(int id) throws SQLException {

		Connection connection = getConnection();

		String sql = "DELETE FROM ropa WHERE id=?";
		PreparedStatement stm = connection.prepareStatement(sql);
		stm.setInt(1, id);

		stm.executeUpdate();

		connection.close();

	}

}
