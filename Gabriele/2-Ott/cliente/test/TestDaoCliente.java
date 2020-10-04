package cliente.test;

import java.util.List;

import cliente.dao.ClienteDao;
import cliente.model.Cliente;

public class TestDaoCliente {
	
	public static void main(String args[]) {
		
		ClienteDao cd = new ClienteDao();
		
		List<Cliente> listCliente = cd.findAll();
		
		listCliente.forEach(cliente -> System.out.println(cliente));
		
	}

}
