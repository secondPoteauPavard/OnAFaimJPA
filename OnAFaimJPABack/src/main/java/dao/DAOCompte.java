package dao;

import java.sql.SQLException;
import java.util.List;

import model.Compte;
import model.Etat;


public interface DAOCompte extends DAOGeneric<Compte,Long> {

	public Compte checkConnect(String email,String mdp) ;
	public List<Compte> findByType(String type);
	public List<Compte> findByAccountStatus(Etat etat);
}

