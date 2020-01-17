package dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.LigneCommande;
import model.LigneCommandePK;
import util.JpaContext;

public class DAOLigneCommandeJpaImpl implements DAOLigneCommande {

	@Override
	public LigneCommande findByKey(LigneCommandePK key) {
		EntityManager em = JpaContext.getInstance().createEntityManager();
		LigneCommande lc = null;
		lc = em.find(LigneCommande.class, key);
		em.close();
		return lc;
	}

	@Override
	public List<LigneCommande> findAll() {
		EntityManager em = JpaContext.getInstance().createEntityManager(); 
		List<LigneCommande> LigneCommandes = null; 
		Query query = em.createQuery("from LigneCommande lc");				
		LigneCommandes = query.getResultList(); 										
		em.close();
		return LigneCommandes;	
	}

	@Override
	public void insert(LigneCommande obj) {
		EntityManager em = JpaContext.getInstance().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.persist(obj);
			tx.commit();
		} catch (Exception e) {
			if (tx != null && tx.isActive()) { 
				tx.rollback(); 
				e.printStackTrace();
			}
		} finally {
			if (em != null && em.isOpen()) { 
				em.close();
			}
		}

	}

	@Override
	public LigneCommande update(LigneCommande obj) {
		EntityManager em = JpaContext.getInstance().createEntityManager();
		EntityTransaction tx = null;
		LigneCommande lc = null; 
		try {
			tx = em.getTransaction();
			tx.begin();
			lc=em.merge(obj); 
			tx.commit();
		} catch (Exception e) {
			if (tx != null && tx.isActive()) { 
				tx.rollback(); 
				e.printStackTrace();
			}
		} finally {
			if (em != null && em.isOpen()) { 
				em.close();
			}
		}
		return lc; 
	}

	@Override
	public void delete(LigneCommande obj) {
		EntityManager em = JpaContext.getInstance().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.remove(em.merge(obj));
			tx.commit();
		} catch (Exception e) {
			if (tx != null && tx.isActive()) { 
				tx.rollback(); 
				e.printStackTrace();
			}
		} finally {
			if (em != null && em.isOpen()) { 
				em.close();
			}
		}
	}

	@Override
	public void deleteByKey(LigneCommandePK key) {
		delete(findByKey(key));
	}


}

