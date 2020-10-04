package cliente.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cliente.dao.ClienteDao;
import cliente.dao.OrdineDao;
import cliente.model.Cliente;
import cliente.model.Ordine;
import database.exception.MyDataBaseException;

public class TestDaoOrdine {

	public static void main(String[] args) throws SQLException {
		
		OrdineDao od = new OrdineDao();
		
		ClienteDao cd = new ClienteDao();
		
		List<Cliente> listCliente = cd.findAll();
		
		
		
		listCliente.forEach(cliente -> {
			try {
				test(cliente, od);
			} catch (MyDataBaseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		
		
		listCliente.forEach(cliente -> {
			try {
				testUpdate(cliente,od);
				
			} catch (MyDataBaseException e) {
				e.printStackTrace();
			}
			
		});
		
		try {
			testUpdate(listCliente.get(0), od);
		} catch (MyDataBaseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		

		
		List<Ordine> listOrdine = new ArrayList<Ordine>();
		
		listOrdine = od.findAll();
		
		listOrdine.forEach( x -> System.out.println(x));
		
		
		/* IMPLEMENTAZIONE TROPPO PESANTE
		
		listCliente.forEach(c -> {
			try {
				testDelete(c,od);
			} catch (MyDataBaseException e) {
				e.printStackTrace();
			}
		});         GUARDA SOTTO
		*/
		
		try {
			testDelete(listCliente.get(0), od);
		} catch (MyDataBaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		


	}

	
	private static void test(Cliente cliente, OrdineDao od) throws MyDataBaseException {
		
		Random rand = new Random();
		
		int numOrdini = 10 + rand.nextInt(11);
		
		for(int i = 0; i<numOrdini; i++) {
			int mm = 1 + rand.nextInt(12);
			int gg = 5 + rand.nextInt(21);
			
			String data = "2020-" + mm + "-" + gg + " 00:00:00";
			
			double valore = 10000.00 + (10000.00 * rand.nextDouble());
			
			int result = od.create(new Ordine(null, data, valore, cliente.getId()) );
			
			if(result == 0) {
				//throw new MyDataBaseException();
			}
		}
		
	}
	
	private static void testUpdate(Cliente cliente, OrdineDao od) throws MyDataBaseException {
		
		int id_ordine = 10;
		String data = "2020-05-25 00:00:00";
		double valore = 10.4;
		
		
		int result = od.update(new Ordine(id_ordine, data, valore, cliente.getId()));
		if(result == 0) {
			throw new MyDataBaseException();
		}
	
	}
	
	int id_ordine;
	
	private static void testDelete(Cliente cliente, OrdineDao od) throws MyDataBaseException {
		
		int id_ordine = 13;
		
		int result = od.delete(new Ordine (id_ordine));
		
		if(result == 0) {
			throw new MyDataBaseException();
		}
		
	}
	

}
