package TiendaRopaABS.ProductDao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import TiendaRopaABSEntity.Description;

public class TiendaRopaABSDescriptionDaoJPAImpl {
	

		private EntityManager em = Persistence.createEntityManagerFactory("tiendaropa_PU").createEntityManager();

		public Description read(int id) {
			return em.find(Description.class, id);
		}

		public void create(Description description) {
			em.getTransaction().begin();
			em.persist(description);
			em.getTransaction().commit();
		}

		public void update(Description description) {
			em.getTransaction().begin();
			em.merge(description);
			em.getTransaction().commit();
		}

		public void delete(Description description) {
			em.getTransaction().begin();
			em.remove(description);
			em.getTransaction().commit();
		}
	

}
