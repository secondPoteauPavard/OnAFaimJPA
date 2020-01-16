package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import model.Compte;
import model.Etat;
import util.JpaContext;

public class DaoCompteJpaImpl implements DAOCompte {

	@Override
	public Compte findByKey(Integer key) {
		EntityManager em= JpaContext.getInstance().createEntityManager();
		Compte c= null;
		c= em.find(Compte.class, key);
		return c;
	}

	@Override
	public List<Compte> findAll() {
		EntityManager em = JpaContext.getInstance().createEntityManager();
		List<Compte> comptes = null;
		Query query = em.createQuery("from Compte c");
		comptes = query.getResultList();
		em.close();
		return comptes;
	}

	@Override
	public void insert(Compte obj) {
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
			}
			e.printStackTrace();
		} finally {
			if (em != null && em.isOpen()) {
				em.close();
			}
		}
	}

	@Override
	public Compte update(Compte obj) {
		EntityManager em = JpaContext.getInstance().createEntityManager();
		EntityTransaction tx = null;
		Compte c = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			c = em.merge(obj);
			tx.commit();
		} catch (Exception e) {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null && em.isOpen()) {
				em.close();
			}
		}
		return c;
	}

	@Override
	public void delete(Compte obj) {
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
			}
			e.printStackTrace();
		} finally {
			if (em != null && em.isOpen()) {
				em.close();
			}
		}
	}

	@Override
	public void deleteByKey(Integer key) {
		delete(findByKey(key));
	}

	@Override
	public Compte checkConnect(String email, String mdp) {
		EntityManager em = JpaContext.getInstance().createEntityManager();
		Compte c= null;
		
		try {
		Query query= em.createQuery("from Compte c where email=:email and mdp=:mdp");
		query.setParameter("email", email.toLowerCase());
		query.setParameter("mdp", mdp);
		c= (Compte) query.getSingleResult();
		}catch (NoResultException e) {e.printStackTrace();}
		return c;	
	}

	@Override
	public List<Compte> findByType(String type) {
		EntityManager em = JpaContext.getInstance().createEntityManager();
		Query query = em.createQuery("from Compte c where type=:type");
		query.setParameter("type", type);
		List<Compte> comptes = query.getResultList();
		em.close();
		return comptes;
	}

	@Override
	public List<Compte> findByAccountStatus(Etat etat) {
		EntityManager em = JpaContext.getInstance().createEntityManager();
		Query query = em.createQuery("from Compte c where compteEtat=:etat");
		query.setParameter("compteEtat", etat);
		List<Compte> comptes = query.getResultList();
		em.close();
		return comptes;
	}

}
