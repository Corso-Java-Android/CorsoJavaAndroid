package database.test01;

import java.util.List;

import database.dao.ClientiDao;
import database.dao.RegioniDao;
import database.model.Cliente;
import database.model.Regione;

public class TestDao {

	public static void main(String[] args) {
		RegioniDao td = new RegioniDao();
		
		List<Regione> regioni = td.findAll();
		
		regioni.forEach(regione -> System.out.println(regione));
		
		System.out.println("*******************Stampa Clienti");
		
		ClientiDao cd = new ClientiDao();
		
		List<Cliente> clienti = cd.findAll();
		
		clienti.forEach(cliente -> System.out.println(cliente));
	}
}
