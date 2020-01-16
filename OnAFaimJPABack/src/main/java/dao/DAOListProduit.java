package dao;

import java.sql.SQLException;
import java.util.List;

import model.LigneCommande;

public interface DAOListProduit extends DAOGeneric<LigneCommande,Integer> {
	public List<LigneCommande> selectAllForClient(Integer idClient) throws ClassNotFoundException, SQLException;
}
