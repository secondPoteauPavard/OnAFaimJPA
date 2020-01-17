package jpa;

import dao.DAOCommande;
import dao.DAOCommandeFactory;
import dao.DAOCompte;
import dao.DAODevis;
import dao.DAODevisFactory;
import dao.DAOLigneCommande;
import dao.DAOLigneCommandeFactory;
import dao.DAOProduit;
import dao.DAOProduitFactory;
import dao.DaoCompteFactory;
import model.Commande;
import model.Compte;
import model.Devis;
import model.LigneCommande;
import model.LigneCommandePK;
import model.Produit;
import util.JpaContext;

public class AppTestThibaut {

	public static void main(String[] args) {
		
		JpaContext.getInstance();
		
		DAOCompte daoC=DaoCompteFactory.getInstance();
		DAOCommande daoCom=DAOCommandeFactory.getInstance();
		DAODevis daoD=DAODevisFactory.getInstance();
		DAOProduit daoP=DAOProduitFactory.getInstance();
		DAOLigneCommande daoL=DAOLigneCommandeFactory.getInstance();
		
		
		Compte c=daoC.findByKey(1L);
		//Compte c=new Compte("lesueur","thibaut","0644702418","thibautlesueur@hotmail.fr","mdp");
		//daoC.insert(c);
		
		//Commande com=new Commande();
		//com.setCompte(c);
		//daoCom.insert(com);
		
		/*Devis d=new Devis();
		d.setCompte(c);
		daoD.insert(d);
		
		Produit p=new Produit();
		p.setLibelle("choco");
		daoP.insert(p);*/
		
		LigneCommande l=new LigneCommande();
		LigneCommandePK lpk=new LigneCommandePK();
		Commande com = daoCom.findByKey(100L);
		lpk.setCommande(com);
		Produit prod = daoP.findByKey(1L);
		lpk.setProduit(prod);
		
		
		
		
		l.setQte(3);
		l.setId(lpk);
		daoL.insert(l);
		
		
		JpaContext.destroy();
		
	}

}
