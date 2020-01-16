package model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Embeddable
public class LigneCommandePK implements Serializable {
	
	@ManyToOne(mappedBy= "id.commande")
	private Commande commande; 
	
	@ManyToOne
	@JoinColumn(name="produit_id", foreignKey = @ForeignKey(name="commande_produit_produit_id_fk"))
	private Produit produit;

	public LigneCommandePK() {
	}

	public LigneCommandePK(Commande commande, Produit produit) {
		this.commande = commande;
		this.produit = produit;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	
	
	
}

