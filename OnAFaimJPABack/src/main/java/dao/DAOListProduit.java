package dao;

import java.sql.SQLException;
import java.util.List;

import model.ListProduit;

public interface DAOListProduit extends DAOGeneric<ListProduit,Integer> {
	public List<ListProduit> selectAllForClient(Integer idClient) throws ClassNotFoundException, SQLException;
}
