package EjercicioJPAABSApp;

import EjercicioJPAABS.Entity.Clientes;
import EjercicioJPAABS.Dao.EjercicioJPAABSDaoImpl;

public class MundoBancario {

	public static void main(String[] args) {
		
		EjercicioJPAABSDaoImpl JPAABSDao = new EjercicioJPAABSDaoImpl();

		Clientes clientes = new Clientes();
		
		clientes.setDni("45999146C");
		clientes.setName("Alvaro");
		clientes.setAddress("jilguero");		

		JPAABSDao.create(clientes);

		

}
}