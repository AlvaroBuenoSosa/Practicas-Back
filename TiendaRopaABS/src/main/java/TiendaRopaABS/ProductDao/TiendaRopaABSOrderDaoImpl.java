package TiendaRopaABS.ProductDao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import TiendaRopaABSEntity.Order;

public class TiendaRopaABSOrderDaoImpl {
	
	private EntityManager em = Persistence.createEntityManagerFactory("tiendaropa_PU").createEntityManager();

	public Order read(int id) {
		return em.find(Order.class, id);
	}

	public void create(Order order) {
		em.getTransaction().begin();
		em.persist(order);
		em.getTransaction().commit();
	}

	public void update(Order order) {
		em.getTransaction().begin();
		em.merge(order);
		em.getTransaction().commit();
	}

	public void delete(Order order) {
		em.getTransaction().begin();
		em.remove(order);
		em.getTransaction().commit();
	}

}
