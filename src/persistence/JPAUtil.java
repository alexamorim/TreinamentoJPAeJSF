package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	// EntityManager, que
	// representa, entre outras coisas, uma conex�o com a unidade de
	// persist�ncia.
	private static EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("AutomovelJPAPU");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}
