package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="devis")
@SequenceGenerator(name="seqDevis",sequenceName="seq_devis",initialValue=100,allocationSize=1)
public class Devis {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqDevis")
	private Integer idDevis;
	@Column(name="eval")
	private int dEval;
	@Column(name="prix")
	private double prix;
	@Column(name="etat",length=15)
	private String dEtat;
	@Column(name="description",length=255)
	private String description;
	@Temporal(TemporalType.DATE)
	@Column(name="dateCommande")
	private Date date;
	@ManyToOne
	@JoinColumn(name="compte", foreignKey = @ForeignKey(name="compte_devis_fk"))
	private Compte compte;
	
	
	public Devis() {
	}

	
	

	public Integer getIdDevis() {
		return idDevis;
	}


	public void setIdDevis(Integer idDevis) {
		this.idDevis = idDevis;
	}


	public int getdEval() {
		return dEval;
	}


	public void setdEval(int dEval) {
		this.dEval = dEval;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public String getdEtat() {
		return dEtat;
	}


	public void setdEtat(String dEtat) {
		this.dEtat = dEtat;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Compte getCompte() {
		return compte;
	}


	public void setCompte(Compte compte) {
		this.compte = compte;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idDevis == null) ? 0 : idDevis.hashCode());
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
		Devis other = (Devis) obj;
		if (idDevis == null) {
			if (other.idDevis != null)
				return false;
		} else if (!idDevis.equals(other.idDevis))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
