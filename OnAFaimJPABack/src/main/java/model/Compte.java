package model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="account")
@SequenceGenerator(name="seqCompte", sequenceName = "seq_account", initialValue = 1, allocationSize = 1)
public class Compte {

	@Id
	@GeneratedValue(generator = "seqCompte", strategy = GenerationType.SEQUENCE)
	private Integer idCompte; 
	@Column(name="last_name", nullable=false)
	private String nom;
	@Column(name="first_name", nullable=false)
	private String prenom; 
	@Column(name="number", length=10, nullable=false)
	private String numero;
	@Column(name="email", nullable=false)
	@Email
	private String email; 
	@Column(name="password", nullable=false)
	private String mdp; 
	@Column(name="type", nullable=false)
	private String type; 
	@Enumerated(EnumType.STRING)
	@Column(name="account_status", columnDefinition="'en_attente'")
	private Etat compteEtat;
	@Version
	private int version;
	@OneToMany(mappedBy="idCom.commande") //PAS UNE ERREUR 
	private Set<Commande> commandes;
	@OneToMany(mappedBy="idDevis.commande") //PAS UNE ERREUR
	private Set<Devis> deviss;
	
	
	
	
	public Compte() {
	}

	public Compte(String nom, String prenom, String numero, String email, String mdp) {
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.email = email;
		this.mdp = mdp;
	}

	public Integer getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(Integer idCompte) {
		this.idCompte = idCompte;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Etat getCompteEtat() {
		return compteEtat;
	}

	public void setCompteEtat(Etat compteEtat) {
		this.compteEtat = compteEtat;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCompte == null) ? 0 : idCompte.hashCode());
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
		Compte other = (Compte) obj;
		if (idCompte == null) {
			if (other.idCompte != null)
				return false;
		} else if (!idCompte.equals(other.idCompte))
			return false;
		return true;
	}
	
	

}