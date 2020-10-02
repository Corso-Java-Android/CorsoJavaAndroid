package database.test01;

import java.util.List;

import database.dao.RegioniDao;
import database.model.Regione;

public class TestDao {

	public static void main(String[] args) {
		RegioniDao td = new RegioniDao();
		
		List<Regione> regioni = td.findAll();
		
		regioni.forEach(regione -> System.out.println(regione));
	}
}
