package database.test01;

import java.util.List;

import database.dao.RegioniDao;
import database.model.Regione;

public class TestDao {

	public static void main(String[] args) {
		RegioniDao td = new RegioniDao();
		//Regione reg = new Regione(26, "Ciao", 54, 76);
		
		List<Regione> regioni = td.findAll();
		
		//td.findById(1);
		
		//td.update(reg);

		
		
		regioni.forEach(regione -> System.out.println(regione));
	}
}
