package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Devis;
import model.Etat;
import util.JpaContext;

public class DAODevisJpaImpl implements DAODevis {

	
	@Override
	public Devis findByKey(Long key) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		Devis p=null;
		p=em.find(Devis.class, key);
		em.close();
		return p;
	}

	@Override
	public List<Devis> findAll() {
		EntityManager em = JpaContext.getInstance().createEntityManager();
		List<Devis> Deviss=null;
		Query query=em.createQuery("select d from Devis d");
		Deviss=query.getResultList();
		em.close();
		return Deviss;
	}

	@Override
	public void insert(Devis obj) {
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
	public Devis update(Devis obj) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		EntityTransaction tx = null;
		Devis c=null;
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
	public void delete(Devis obj) {
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
	public List<Devis> findDevisByCEtat(Etat dEtat) {
		EntityManager em = JpaContext.getInstance().createEntityManager();
		Query query=em.createQuery("from Devis d where dEtat=:etat");
		query.setParameter("etat", dEtat);
		List<Devis> deviss=null;
		deviss=query.getResultList();
		em.close();
		return deviss;
	}
	
}
