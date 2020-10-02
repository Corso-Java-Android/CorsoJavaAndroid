package database.dao;

import java.util.List;

public interface Dao<T> {

	List<T> findAll(); // R
	
	T findById(int id); // R
	
	int update(T t); // U
	
	int delete(T t); // D
	
	int create(T t); // C
	
}
