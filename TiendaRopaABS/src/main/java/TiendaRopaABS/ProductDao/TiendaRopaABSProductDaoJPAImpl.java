package TiendaRopaABS.ProductDao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import TiendaRopaABSEntity.Product;

public class TiendaRopaABSProductDaoJPAImpl {
	
	EntityManager em = Persistence.createEntityManagerFactory("tiendaropa_PU").createEntityManager();
		
	public Product read(int id) {
					
		return em.find(Product.class, id);
		
	}
	
	public void create(Product product) {
		
				
		em.getTransaction().begin();
		
		em.persist(product);
		
		em.getTransaction().commit();
		
	}
	
	public void delete(Product product) {
		
		em.getTransaction().begin();
		
		em.remove(product);
		
		em.getTransaction().commit();
		
	}

}
