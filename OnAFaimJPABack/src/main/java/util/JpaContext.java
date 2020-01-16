package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaContext {

	private static EntityManagerFactory emf=null;
	
	public static EntityManagerFactory getInstance() {
		if (emf==null) {
			emf=Persistence.createEntityManagerFactory("OnAFaimJPA");
		}
		return emf;
	}
	
	
	public static void destroy() {
		if(emf!=null) {
			emf.close();
			emf=null;
		}
	}
	
	
}
