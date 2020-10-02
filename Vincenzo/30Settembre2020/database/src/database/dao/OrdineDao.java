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
				Ordine ordine = new Ordine(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));

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
		Connection connection = null;
		String query = "select ID_ORDINE, DATA, VALORE, ID_CLIENTE from ordini where ID_ORDINE = "+id;
		Statement st = null;
		ResultSet rs = null;
		try {
			connection = ConnectionManager.getInstance().getConnection();
			st = connection.createStatement();
			rs = st.executeQuery(query);

			if( rs.next() ) {
				Ordine ordine = new Ordine(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
				return ordine;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			//			throw new MyDatabaseException(e);
		} finally {
			try { rs.close(); } catch (Exception e) {}
			try { st.close(); } catch (Exception e) {}
			try { connection.close(); } catch (Exception e) {}
		}

		return null;
	}

	@Override
	public int update(Ordine o) {
		Connection connection = null;
		String query = "update ordini set DATA = ?, VALORE = ?, ID_CLIENTE = ? where ID_ORDINE = ?";
		PreparedStatement st = null;

		try {
			connection = ConnectionManager.getInstance().getConnection();
			st = connection.prepareStatement(query);
			st.setString(1, o.getData());
			st.setDouble(2, o.getValore());
			st.setInt(3, o.getID_CLIENTE());
			st.setInt(4, o.getID_ORDINE());

			int i = st.executeUpdate();

			return i;
		} catch (SQLException e) {
			e.printStackTrace();
			//throw new MyDatabaseException(e);
		}finally {
			try { st.close(); } catch (Exception e) {}
			try { connection.close(); } catch (Exception e) {}
		}	

		return 0;
	}

	@Override
	public int delete(Ordine o) {
		Connection connection = null;
		String query = "delete from ordini where ID_ORDINE = ?";
		PreparedStatement st = null;

		try {
			connection = ConnectionManager.getInstance().getConnection();
			st = connection.prepareStatement(query);

			st.setInt(1, o.getID_ORDINE());
			int i = st.executeUpdate();
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
			//throw new MyDatabaseException(e);
		}finally {
			try { st.close(); } catch (Exception e) {}
			try { connection.close(); } catch (Exception e) {}
		}			
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
