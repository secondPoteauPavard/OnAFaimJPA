package dao;

public class DAOProduitFactory {

	private static DAOProduit daoProduits = null;

	public static DAOProduit getInstance() {
		if (daoProduits == null) {
			daoProduits = new DAOProduitJpaImpl();
		}
		return new DAOProduitJpaImpl();
	}

}
