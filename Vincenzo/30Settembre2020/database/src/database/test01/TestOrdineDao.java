package database.test01;

import java.util.List;
import java.util.Random;

import database.dao.ClientiDao;
import database.dao.OrdineDao;
import database.exceptions.MyDatabaseException;
import database.model.Cliente;
import database.model.Ordine;

public class TestOrdineDao {

	public static void main(String[] args) {
		OrdineDao od = new OrdineDao();

		ClientiDao cd = new ClientiDao();

		List<Cliente> clienti = cd.findAll();
		
		clienti.forEach(cliente -> {
			try {
				test(cliente, od);
			} catch (MyDatabaseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		//STAMPA TUTTI GLI ORDINI
		List<Ordine> ordini = od.findAll();

		ordini.forEach(ordine -> System.out.println(ordine));
	}

	private static void test(Cliente cliente, OrdineDao od) throws MyDatabaseException {
		Random random = new Random(System.currentTimeMillis());
		int numOrdini = 10 + random.nextInt(11);	//genera un int tra 10+0 e 10+10
		for(int i=0;i<numOrdini;i++){
			int MM = 1 + random.nextInt(12);	//genera un int tra 1+0 e 1+11
			int GG = 5 + random.nextInt(21);	//genera un int tra 5+0 e 5+20
			String data = "2020-"+MM+"-"+GG+" 00:00:00";
			double valore = 10000.00 + (10000.00 * random.nextDouble());
			int result = od.create(new Ordine(null, data, valore, cliente.getID()));
			if(result==0)
				throw new MyDatabaseException();
		}
	}

}
