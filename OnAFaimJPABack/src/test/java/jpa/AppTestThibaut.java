package jpa;

import dao.DAOCompte;
import dao.DaoCompteFactory;
import model.Compte;
import util.JpaContext;

public class AppTestThibaut {

	public static void main(String[] args) {
		
		JpaContext.getInstance();
		
		DAOCompte daoC=DaoCompteFactory.getInstance();
		
		Compte c=new Compte("lesueur","thibaut","0644702418","thibautlesueur@hotmail.fr","mdp");
		
		daoC.insert(c);
		
		
		JpaContext.destroy();
		
	}

}
