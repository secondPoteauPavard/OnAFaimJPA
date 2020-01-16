package dao;

public class DaoCompteFactory {

	private static DAOCompte daoCompte=null;
	
	public static DAOCompte getInstance() {
		if (daoCompte==null) {
			daoCompte = new DaoCompteJpaImpl();
		}
		return daoCompte;
	}
}
