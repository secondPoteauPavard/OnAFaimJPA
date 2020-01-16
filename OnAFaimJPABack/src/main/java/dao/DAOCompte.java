package dao;

import java.sql.SQLException;

import model.Compte;


public interface DAOCompte extends DAOGeneric<Compte,Integer> {

	public Compte checkConnect(String email,String pass) ;
}

