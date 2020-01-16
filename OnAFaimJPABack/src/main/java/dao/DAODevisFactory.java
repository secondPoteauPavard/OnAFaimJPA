package dao;

public class DAODevisFactory {
	
	private static DAODevis daoDevis=null;

	public static DAODevis getInstance() {
		if (daoDevis == null) {
			daoDevis = new DAODevisJpaImpl();
		}
		return daoDevis;
	}
	
}