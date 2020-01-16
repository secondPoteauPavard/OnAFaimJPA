package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

import net.bytebuddy.implementation.auxiliary.AuxiliaryType.SignatureRelevant;

@Entity
@Table(name="commande_produit")
public class LigneCommande {
	
	@Size(min="0", max="100")
	@Column(name="quantity", length=5)
	private int qte;
	
	@EmbeddedId
	private LigneCommandePK id; 
	
	@Version
	private Version version;

	public LigneCommande() {
	}

	public LigneCommande(int qte, LigneCommandePK id) {
		this.qte = qte;
		this.id = id;
	}

	
	
	
}
