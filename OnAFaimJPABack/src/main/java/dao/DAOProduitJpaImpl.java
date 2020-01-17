package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Produit;
import util.JpaContext;

class DAOProduitJpaImpl implements DAOProduit {					
																	
	@Override
	public Produit findByKey(Long key) {
		EntityManager em= JpaContext.getInstance().createEntityManager(); 		 
		Produit p = null; 
		p = em.find(Produit.class, key);
		em.close();																
		return p;
	}

	@Override
	public List<Produit> findAll() {
		EntityManager em = JpaContext.getInstance().createEntityManager(); 
		List<Produit> Produits = null; 
		Query query = em.createQuery("from Produit p");				
		Produits = query.getResultList(); 										
		em.close();
		return Produits;															
	}

	@Override
	public void insert(Produit obj) {
		EntityManager em= JpaContext.getInstance().createEntityManager(); 
		EntityTransaction tx = null; 
		try {
			tx = em.getTransaction(); 
			tx.begin();
			em.persist(obj);
			tx.commit();
		}catch (Exception e) {
			if(tx!=null && tx.isActive()) {			
			tx.rollback(); 							
			e.printStackTrace();
			}
		}finally {
			if(em!=null && em.isOpen()) {			
			em.close();
			}	
		}
		
	}

	@Override
	public Produit update(Produit obj) {
		EntityManager em= JpaContext.getInstance().createEntityManager(); 
		EntityTransaction tx = null; 
		Produit p = null; 
		try {
			tx = em.getTransaction(); 
			tx.begin();
			p=em.merge(obj);							
			tx.commit();
		}catch (Exception e) {
			if(tx!=null && tx.isActive()) {			
			tx.rollback(); 							
			e.printStackTrace();
			}
		}finally {
			if(em!=null && em.isOpen()) {			
			em.close();
			}	
		}
		return p;
	}


	@Override
	public void delete(Produit obj) {
		EntityManager em= JpaContext.getInstance().createEntityManager(); 
		EntityTransaction tx = null; 
		try {
			tx = em.getTransaction(); 
			tx.begin();
			em.remove(em.merge(obj));								
			tx.commit();
		}catch (Exception e) {
			if(tx!=null && tx.isActive()) {			
			tx.rollback(); 							
			e.printStackTrace();
			}
		}finally {
			if(em!=null && em.isOpen()) {			
			em.close();
			}	
		}
	}

	@Override
	public void deleteByKey(Long key) {
		delete(findByKey(key)); 
	}

	
	public List<Produit> findBySize(String size) {
		EntityManager em = JpaContext.getInstance().createEntityManager(); 
		Query query = em.createQuery("from Produit p where p.taille=:taille");
		query.setParameter("taille", size.toLowerCase());
		List<Produit> Produits = query.getResultList(); 
		em.close();
		return Produits; 
	}
	
	public List<Produit> findByType(String type){
		EntityManager em = JpaContext.getInstance().createEntityManager(); 
		Query query = em.createQuery("from Produit p where p.type=:type");
		query.setParameter(1, type); 
		List<Produit> Produits = query.getResultList(); 
		em.close();
		return Produits; 
		
	}


	
}
