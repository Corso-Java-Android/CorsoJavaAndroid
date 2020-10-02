package database.test01;

import database.dao.OrdineDao;
import database.model.Ordine;

public class TestOrdineDao2 {
	
	public static void main(String[] args) {
		OrdineDao od = new OrdineDao();
		
		//Modifica l'ordine con ID 2
		int i = od.update(new Ordine(2, "2020-12-30 00:00:00", 17.98, 1));
		System.out.println("Update ha restituito: "+i);
		
		//Cerca l'ordine con ID = 2
		Ordine o = od.findById(2);
		System.out.println("FindByID ha restituito: "+o);
		
		//Cancella l'ordine con ID 3
		i = od.delete(new Ordine(3, "2020-12-30 00:00:00", 16.18, 1));
		System.out.println("Delete ha restituito: "+i);

	}

}
