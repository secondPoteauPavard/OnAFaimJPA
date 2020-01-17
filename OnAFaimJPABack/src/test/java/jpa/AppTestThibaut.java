package jpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

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
import model.Etat;
import model.LigneCommande;
import model.LigneCommandePK;
import model.Produit;
import model.TypeCompte;
import util.JpaContext;

public class AppTestThibaut {
	
	public static int genererNombre(int min, int max) {
		Random r = new Random() ;
		int chiffre = min+r.nextInt(max-min+1) ;
		return chiffre;
	}

	public static void main(String[] args) {
		
		JpaContext.getInstance();
		
		DAOCompte daoC=DaoCompteFactory.getInstance();
		DAOCommande daoCom=DAOCommandeFactory.getInstance();
		DAODevis daoD=DAODevisFactory.getInstance();
		DAOProduit daoP=DAOProduitFactory.getInstance();
		DAOLigneCommande daoL=DAOLigneCommandeFactory.getInstance();
		
		
		// ------------------------------ Remplissage de la bdd ---------------------------------
		Compte c=new Compte("adminnom","adminprenom","0644778418","admin@admin.fr","admin");
		c.setType(TypeCompte.admin);
		daoC.insert(c);
	
		
		
		
		for (int i=0;i<60;i++) {
			if (i%2==0) {
				c=new Compte("doe"+i,"john"+i,"0644702425","john"+i+"@doe.fr","mdp");
				daoC.insert(c); // Insert compte
			}
			Produit p = new Produit();
			p.setLibelle("choco"+i);
			daoP.insert(p); // insert produit
			
			Devis d=new Devis();
			d.setCompte(c); // insert devis
			daoD.insert(d);
				
			Commande com=new Commande();
			com.setCompte(c); // insert commande
			daoCom.insert(com);
			
			
			
			LigneCommande l=new LigneCommande();
			LigneCommandePK lpk=new LigneCommandePK();
			lpk.setCommande(com); // insert liste produit
			lpk.setProduit(p);
			l.setQte(genererNombre(1, 10));
			l.setId(lpk);
			daoL.insert(l);
		}
		
		// --------------------------------------------------------------------------------
		System.out.println("---------------------------- FIN TIB ------------------------------");
		
		List<Devis> l=new ArrayList();		
		l=daoD.findDevisByCEtat(Etat.W);
		//System.out.println(l);
		

		
		
		JpaContext.destroy();
		
	}

}
