package dao;

import java.util.List;

import model.Commande;


public interface DAOCommande extends DAOGeneric<Commande,Long> {
	
	public List<Commande> findCommandeByCEtat(String cEtat);
	
}

