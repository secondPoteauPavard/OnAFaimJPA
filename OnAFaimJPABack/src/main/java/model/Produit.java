package model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="produit")
@SequenceGenerator(name="seqProduit", sequenceName = "seq_produit", initialValue = 1, allocationSize = 1)

public class Produit {
	@Id
	@GeneratedValue(generator = "seqProduit", strategy = GenerationType.SEQUENCE)
	private Long idProduit;
	@Column(name="wording", nullable = true)
	private String libelle;
	@Column(name="size", nullable = true)
	private String taille;
	@Column(name="price", nullable = true)
	private double prix;
	@Column(name="type",length=25)
	@Enumerated(EnumType.STRING)
	private Type type; 
	@Lob
	@Column(name="description")
	private String Description; 
	@Lob
	@Column(name="picture")
	private byte[] photo;
	@OneToMany(mappedBy = "id.produit")
	private Set<LigneCommande> ligneCommandes; 

	
	
	
	
	public Produit() {
	}

	
	public Produit(String libelle, String taille, double prix, Type type, String description,
			byte[] photo) {
		this.libelle = libelle;
		this.taille = taille;
		this.prix = prix;
		this.type = type;
		Description = description;
		this.photo = photo;
	}

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	
	public byte[] getPhoto() {
		return photo;
	}


	public void setPhoto(byte[] photo) {
		this.photo = photo;
	} 


	public Set<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}


	public void setLigneCommandes(Set<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idProduit == null) ? 0 : idProduit.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produit other = (Produit) obj;
		if (idProduit == null) {
			if (other.idProduit != null)
				return false;
		} else if (!idProduit.equals(other.idProduit))
			return false;
		return true;
	} 
	
	
}
