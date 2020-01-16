package dao;

import java.util.List;

import model.Produit;

public interface DAOProduit extends DAOGeneric<Produit,Integer> {
	
	public List<Produit> findBySize(String size); 
	public List<Produit> findByType(String type); 
	
	
}
