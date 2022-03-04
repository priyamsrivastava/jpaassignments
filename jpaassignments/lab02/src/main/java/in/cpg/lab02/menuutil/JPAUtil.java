package in.cpg.lab02.menuutil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory entityManagerFactory;
	
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	
	public void beginTransaction() {
		getEntityManager().getTransaction().begin();
	}
	
	public void commitTransaction() {
		getEntityManager().getTransaction().commit();
	}
	
	public void closeEntityManager() {
		getEntityManager().close();
	}
	
}
