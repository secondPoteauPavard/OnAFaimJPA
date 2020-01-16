package dao;

import java.util.List;

public interface DAOGeneric<T,K> {
	
	public T findByKey(K key);
	public List<T> findAll();
	public void insert(T obj);
	public T update(T obj);
	public void delete(T obj);
	public void deleteByKey(K key);
	
	
}
