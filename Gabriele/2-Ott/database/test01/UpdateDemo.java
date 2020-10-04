package database.test01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.exception.MyDataBaseException;
import database.util.ConnectionManager;

public class UpdateDemo {

	public static void main(String[] args) throws MyDataBaseException {
		// TODO Auto-generated method stub
		
		Connection connection = null;
		
		String query = "update tab1" +
				       " set descrizione = ?, valore = ?" +
				       " where id = ?";
		
		PreparedStatement st = null;
		
		try {
			connection = ConnectionManager.getInstance().getConnection();
			
			st = connection.prepareStatement(query);
			
			st.setString(1, "La mia nuova descrizione");  //VALORE INIZIALE: "DESCRIZIONE DI PROVA"
			st.setInt(2, 500);							  //VALORE INIZIALE: 100.3
			st.setInt(3, 1);							  //PRIMA RIGA ID = 1
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
