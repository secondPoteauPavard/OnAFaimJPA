package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="produit")


public class Produit {
	@Id
	@OneToMany
	@JoinColumn(name="produit_id", foreignKey = @ForeignKey(name="commande_produit_produit_id_fk"))
	private int idProduit;
	@Column(name="wording", length=50)
	private String libelle;
	@Column(name="size")
	private String taille;
	@Column(name="price", length=10)
	private double prix;
	private Type type; 
	@Lob
	@Column(name="description", length=100)
	private String Description; 
	@Lob
	@Column(name="picture")
	private byte[] photo;

	
	public Produit() {
	}

	
	public Produit(int idProduit, String libelle, String taille, double prix, Type type, String description,
			byte[] photo) {
		this.idProduit = idProduit;
		this.libelle = libelle;
		this.taille = taille;
		this.prix = prix;
		this.type = type;
		Description = description;
		this.photo = photo;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProduit;
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
		if (idProduit != other.idProduit)
			return false;
		return true;
	} 
	
	
}
