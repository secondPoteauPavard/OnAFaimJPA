package dao;

public class DAOLigneCommandeFactory {

	private static DAOLigneCommande daoLigneCommandes = null;

	public static DAOLigneCommande getInstance() {
		if (daoLigneCommandes == null) {
			daoLigneCommandes = new DAOLigneCommandeJpaImpl();
		}
		return new DAOLigneCommandeJpaImpl();
	}

}
