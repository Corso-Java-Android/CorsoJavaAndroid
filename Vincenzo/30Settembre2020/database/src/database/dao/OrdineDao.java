package database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import database.model.Ordine;
import database.util.ConnectionManager;

public class OrdineDao implements Dao<Ordine> {

	public OrdineDao() {
	}

	@Override
	public List<Ordine> findAll() {
		List<Ordine> ordini = new ArrayList<>();
		Connection connection = null;
		String query = "select ID_ORDINE, DATA, VALORE, ID_CLIENTE from ordini";
		Statement st = null;
		ResultSet rs = null;
		try {
			connection = ConnectionManager.getInstance().getConnection();
			
			st = connection.createStatement();
			rs = st.executeQuery(query);
			
			while( rs.next() ) {
				Ordine ordine = new Ordine(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
				
				ordini.add(ordine);
			}
		} catch (SQLException e) {
			e.printStackTrace();
//			throw new MyDatabaseException(e);
		} finally {
			try { rs.close(); } catch (Exception e) {}
			try { st.close(); } catch (Exception e) {}
			try { connection.close(); } catch (Exception e) {}
		}
		
		return ordini;
	}

	@Override
	public Ordine findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Ordine t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Ordine t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int create(Ordine o) {
		Connection connection = null;
		String query = "insert into ordini values (null, ?, ?, ?)";
		PreparedStatement st = null;
		try {
			
			connection = ConnectionManager.getInstance().getConnection();
			
			st = connection.prepareStatement(query);
			st.setString(1, o.getData());
			st.setDouble(2, o.getValore());
			st.setInt(3, o.getID_CLIENTE());
			
			st.executeUpdate();
			
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
			//throw new MyDatabaseException(e);
		} finally {
			try { st.close(); } catch (Exception e) {}
			try { connection.close(); } catch (Exception e) {}
		}
		return 0;
	}

}
