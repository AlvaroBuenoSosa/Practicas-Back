package TiendaRopaABS;

import java.sql.Date;
import java.util.Arrays;

import TiendaRopaABS.Dto.TiendaRopaABSProductDto;
import TiendaRopaABS.ProductDao.TiendaRopaABSProductDao;
import TiendaRopaABS.View.TiendaRopaABSMenu;
import TiendaRopaABSEntity.Description;
import TiendaRopaABSEntity.Order;
import TiendaRopaABSEntity.Product;
import TiendaRopaABS.ProductDao.TiendaRopaABSProductDaoJPAImpl;
import TiendaRopaABS.ProductDao.TiendaRopaABSOrderDaoImpl;

public class App {

	public static void main(String[] args) throws Exception {
		/*
		 * TiendaRopaABSProductDao daoJpaImpl = new TiendaRopaABSProductDao();
		 * 
		 * Order order = new Order(); order.setCode("ORDER123");
		 * 
		 * Product product1 = new Product(); product1.setName("Product 1");
		 * product1.setPrice(20.0); product1.setSize("S");
		 * 
		 * Description description1 = new Description();
		 * description1.setDescription("Description for Product 1");
		 * description1.setUser("user1");
		 * 
		 * product1.setDescription(description1); description1.setProduct(product1);
		 * 
		 * Product product2 = new Product(); product2.setName("Product 2");
		 * product2.setPrice(15.0); product2.setSize("L");
		 * 
		 * Description description2 = new Description();
		 * description2.setDescription("Description for Product 2");
		 * description2.setUser("user2");
		 * 
		 * product2.setDescription(description2); description2.setProduct(product2);
		 */

		TiendaRopaABSProductDaoJPAImpl daoJpaImpl = new TiendaRopaABSProductDaoJPAImpl();

		Product product = new Product();

		product.setName("TEST");
		product.setPrice(54.0);
		product.setMarca("adidas");
		product.setType("futbol");
		product.setSize("L");
		product.setColor("negro");

		Description description = new Description();
		description.setDescription("mi descripcion");

		product.setDescription(description);
		description.setProduct(product);

		daoJpaImpl.create(product);

		 TiendaRopaABSMenu menu= new TiendaRopaABSMenu();
		 menu.printMenu();

		 TiendaRopaABSProductDao dao = new TiendaRopaABSProductDao();

		 TiendaRopaABSProductDto p= dao.readProduct(11);

		 System.out.println(p.getName());

		 p.setMarca("Adidas Ahora");

		 dao.updateProduct(p);

		 //dao.deleteProduct(4);

		 TiendaRopaABSProductDaoJPAImpl dao1= new TiendaRopaABSProductDaoJPAImpl();

		 Product producto = dao1.read(1);

		 System.out.println(producto.getName());

	}

}
