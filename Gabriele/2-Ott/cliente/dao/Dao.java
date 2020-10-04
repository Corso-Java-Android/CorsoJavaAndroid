package cliente.dao;

import java.util.List;

public interface Dao<T> {

	List<T> findAll();       //C R U D
	
	T findbyId(int id);
	
	int update (T t);
	
	int delete(T t);
	
	int create(T t);
}
