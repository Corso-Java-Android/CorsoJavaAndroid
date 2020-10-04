package cliente.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cliente.model.Ordine;
import database.exception.MyDataBaseException;
import database.util.ConnectionManager;

public class OrdineDao implements Dao<Ordine> {
    
	
	@Override
	public List<Ordine> findAll() {      //E' necessario fare questo metodo?
		
		List<Ordine> listOrdine = new ArrayList<Ordine>();
		Connection connection = null;
		String query = "select" + 
		               " id_ordine, data , valore, id_cliente" +
		               " from ordini";
		
		Statement st = null;
		ResultSet rs = null;
		
		try {
			
			connection = ConnectionManager.getInstance().getConnection();
			
			st = connection.createStatement();
			rs = st.executeQuery(query);
			
			while(rs.next()) {
				Ordine ordine = new Ordine(rs.getInt(1),
										   rs.getString(2),
										   rs.getDouble(3),
										   rs.getInt(4) 
										   );
				listOrdine.add(ordine);
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
		
		return listOrdine;
	}
	
	
	

	@Override
	public int create(Ordine o) {
		
		Connection connection = null;
		
		String query = "insert into ordini values (null,?,?,?)";  //ATTENTO QUI!
		PreparedStatement st = null;
		
		try {
			
			connection = ConnectionManager.getInstance().getConnection();
			
			st = connection.prepareStatement(query);
			
			st.setString(1, o.getData());        //METODI CON SET... NON CON GET
			st.setDouble(2, o.getValore());
			st.setInt(3, o.getId_cliente());
			
			st.executeUpdate();
			
			return 1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
		
		return 0;
	}




	@Override
	public Ordine findbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public int update(Ordine o) {
		
		Connection connection = null; 
		
		String query = "update ordini" + 
					   " set id_cliente = ?, data = ?, valore = ?" +
				       " where id_ordine = ?";
		
		PreparedStatement st = null;
		
		try {
			connection = ConnectionManager.getInstance().getConnection();
			
			st = connection.prepareStatement(query);
			
			st.setInt(4, o.getId_ordine());
			st.setString(2,o.getData());
			st.setDouble(3, o.getValore());
			st.setInt(1, o.getId_cliente());
			
			st.executeUpdate();
			
			return 1;
			
		} catch ( SQLException e) {
			e.printStackTrace();
		} finally {
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
		

		return 0;
	}




	@Override
	public int delete(Ordine o) {
		
		Connection connection = null;
		
		String query = "delete" + 
		               " from ordini" + 
				       " where id_ordine = ?";
		
		
		PreparedStatement st = null;
		
		try {
			connection = ConnectionManager.getInstance().getConnection();
			
			st = connection.prepareStatement(query);
			
			st.setInt(1, o.getId_ordine());
			st.executeUpdate();
			
			return 1;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
		return 0;
	}
	
	
	

}
