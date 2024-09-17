package EjercicioJPAABS.Dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import EjercicioJPAABS.Entity.Clientes;

public class EjercicioJPAABSDaoImpl {
	
	EntityManager em = Persistence.createEntityManagerFactory("clientesucursales_PU").createEntityManager();
	
	public Clientes read(int id) {
					
		return em.find(Clientes.class, id);
		
	}
	
	public void create(Clientes clientes) {
		
				
		em.getTransaction().begin();
		
		em.persist(clientes);
		
		em.getTransaction().commit();
		
	}
	
	public void delete(Clientes clientes) {
		
		em.getTransaction().begin();
		
		em.remove(clientes);
		
		em.getTransaction().commit();
		
	}

}


