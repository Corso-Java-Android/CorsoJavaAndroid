package database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import database.model.Regione;
import database.util.ConnectionManager;

public class RegioniDao implements Dao<Regione> {

	@Override
	public List<Regione> findAll() {
		List<Regione> regioni = new ArrayList<>();
		Connection connection = null;
		String query = "select id, nome, latitudine, longitudine from regioni";
		Statement st = null;
		ResultSet rs = null;
		try {
			connection = ConnectionManager.getInstance().getConnection();
			
			st = connection.createStatement();
			rs = st.executeQuery(query);
			
			while( rs.next() ) {
				Regione regione = new Regione(
						rs.getInt(1),
						rs.getString(2),
						rs.getDouble(3),
						rs.getDouble(4)
						);
				
				regioni.add(regione);
			}
		} catch (SQLException e) {
			e.printStackTrace();
//			throw new MyDatabaseException(e);
		} finally {
			try { rs.close(); } catch (Exception e) {}
			try { st.close(); } catch (Exception e) {}
			try { connection.close(); } catch (Exception e) {}
		}
		
		return regioni;
	}

	@Override
	public Regione findById(int id) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int update(Regione t) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int delete(Regione t) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int create(Regione t) {
		throw new UnsupportedOperationException();
	}

}