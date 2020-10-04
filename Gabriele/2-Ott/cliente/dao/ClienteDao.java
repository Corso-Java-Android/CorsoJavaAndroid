package cliente.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cliente.model.Cliente;
import database.util.ConnectionManager;

public class ClienteDao implements Dao<Cliente> {

	@Override
	public List<Cliente> findAll() {
		List<Cliente> listClienti = new ArrayList<Cliente> ();
		Connection connection = null;
		String query = "select" + 
		               " id_cliente,nome,cognome,email,indirizzo,citta,provincia,cap" + 
				       " from clienti";
		Statement st = null;
		ResultSet rs = null;
		
		try {
			connection = ConnectionManager.getInstance().getConnection();
			
			st = connection.createStatement();
			rs = st.executeQuery(query);
			
			while( rs.next() ) {
				Cliente cliente = new Cliente(rs.getInt(1),
											  rs.getString(2),
											  rs.getString(3),
											  rs.getString(4),
											  rs.getString(5),
											  rs.getString(6),
											  rs.getString(7),
											  rs.getInt(8)
						                      );
				listClienti.add(cliente);
			}
			
			
		} catch ( SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return listClienti;
	}
	
	
	

	@Override
	public int create(Cliente t) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public Cliente findbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public int update(Cliente t) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public int delete(Cliente t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
