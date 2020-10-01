package database.test01;

import database.exceptions.MyDatabaseException;
import database.util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	public static void main(String[] args) throws MyDatabaseException{
		Connection connection = null;
		String query = "insert into tab01 values (?, ?, ?)";
		PreparedStatement st = null;
		try {
			
			connection = ConnectionManager.getInstance().getConnection();
			
			st = connection.prepareStatement(query);
			st.setInt(1, 11);
			st.setString(2, "Descrizione linea 11");
			st.setFloat(3, 4567.89f);
			
			st.executeUpdate();
			
			return;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new MyDatabaseException(e);
		} finally {
			System.out.println("eseguito in ogni caso ...");
			try { st.close(); } catch (Exception e) {}
			try { connection.close(); } catch (Exception e) {}
		}	
	}
}

