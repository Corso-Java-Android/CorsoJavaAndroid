package database.test01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.exception.MyDataBaseException;
import database.util.ConnectionManager;

public class DeleteDemo {

	public static void main(String args[]) throws MyDataBaseException {
		
		String query = "delete" + 
					   " from tab1" +
					   " where id = ?";
		
		Connection connection = null;
		
		PreparedStatement st = null;
		
		
		try {
			
			connection = ConnectionManager.getInstance().getConnection();
			
			st = connection.prepareStatement(query);
			
			st.setInt(1, 3);    //Ho eliminato la riga 3
			st.setInt(1, 5);    //Ho eliminato la riga 5
			st.setInt(1, 10);
			st.executeUpdate();   
			
			
		} catch (SQLException e) {
			throw new MyDataBaseException(e);
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
		
		
	}

}
