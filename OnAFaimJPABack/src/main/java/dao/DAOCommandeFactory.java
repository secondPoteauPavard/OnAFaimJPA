package dao;

public class DAOCommandeFactory {
	
	private static DAOCommande daoCommande=null;

	public static DAOCommande getInstance() {
		if (daoCommande == null) {
			daoCommande = new DAOCommandeJpaImpl();
		}
		return daoCommande;
	}
	
}