package dao;

import java.util.List;

import model.Commande;
import model.Devis;

public interface DAODevis extends DAOGeneric<Devis,Long> {

	public List<Devis> findDevisByCEtat(String cEtat);
	
}
