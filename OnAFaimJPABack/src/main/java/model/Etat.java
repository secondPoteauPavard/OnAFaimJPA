package model;

public enum Etat {
	V("validate", "valide"), W("waiting", "en_attente");
	
	private String francais;
	private String anglais;

	private Etat (String francais, String anglais) {
		this.francais = francais;
		this.anglais = anglais;
	}

	public String getFrancais() {
		return francais;
	}

	public String getAnglais() {
		return anglais;
	}
}
