package database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import database.model.Cliente;
import database.util.ConnectionManager;

public class ClientiDao implements Dao<Cliente> {

	public ClientiDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Cliente> findAll() {
		List<Cliente> clienti = new ArrayList<>();
		Connection connection = null;
		String query = "select ID_CLIENTE, NOME, COGNOME, EMAIL, INDIRIZZO, CITTA, PROVINCIA, CAP from clienti";
		Statement st = null;
		ResultSet rs = null;
		try {
			connection = ConnectionManager.getInstance().getConnection();
			
			st = connection.createStatement();
			rs = st.executeQuery(query);
			
			while( rs.next() ) {
				Cliente cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
				
				clienti.add(cliente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
//			throw new MyDatabaseException(e);
		} finally {
			try { rs.close(); } catch (Exception e) {}
			try { st.close(); } catch (Exception e) {}
			try { connection.close(); } catch (Exception e) {}
		}
		return clienti;
	}

	@Override
	public Cliente findById(int id) {
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

	@Override
	public int create(Cliente t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
