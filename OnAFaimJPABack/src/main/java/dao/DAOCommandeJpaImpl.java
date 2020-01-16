package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Commande;
import util.JpaContext;

public class DAOCommandeJpaImpl implements DAOCommande {

	@Override
	public Commande findByKey(Long key) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		Commande p=null;
		p=em.find(Commande.class, key);
		em.close();
		return p;
	}

	@Override
	public List<Commande> findAll() {
		EntityManager em = JpaContext.getInstance().createEntityManager();
		List<Commande> Commandes=null;
		Query query=em.createQuery("select p from Commande p");
		Commandes=query.getResultList();
		em.close();
		return Commandes;
	}

	@Override
	public void insert(Commande obj) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx=em.getTransaction();
			tx.begin();
			em.persist(obj);
			tx.commit();
		} 
		catch (Exception e) {
			if (tx!=null && tx.isActive()) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if (em!=null && em.isOpen()) {
				em.close();
			}
		}
	}

	@Override
	public Commande update(Commande obj) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		EntityTransaction tx = null;
		Commande c=null;
		try {
			tx=em.getTransaction();
			tx.begin();
			c=em.merge(obj);
			tx.commit();
		} 
		catch (Exception e) {
			if (tx!=null && tx.isActive()) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if (em!=null && em.isOpen()) {
				em.close();
			}
		}
		return c;
	}
	

	@Override
	public void delete(Commande obj) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx=em.getTransaction();
			tx.begin();
			em.remove(em.merge(obj));
			tx.commit();
		} 
		catch (Exception e) {
			if (tx!=null && tx.isActive()) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if (em!=null && em.isOpen()) {
				em.close();
			}
		}
		
	}

	@Override
	public void deleteByKey(Long key) {
		delete(findByKey(key));
	}

	@Override
	public List<Commande> findCommandeByCEtat(String etat) {
		EntityManager em = JpaContext.getInstance().createEntityManager();
		Query query=em.createQuery("from Commande c where c.cEtat=?1");
		query.setParameter(1, etat);
		List<Commande> commandes=null;
		commandes=query.getResultList();
		em.close();
		return commandes;
	}

}
