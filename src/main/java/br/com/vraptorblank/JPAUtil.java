package br.com.vraptorblank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	
	public EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
}
