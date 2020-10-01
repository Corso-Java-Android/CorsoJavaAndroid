package database.test01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.util.ConnectionManager;

public class InsertDemo {

	public static void main(String[] args) {
		Connection connection = null;
		String query = "insert into tab01 values (?, ?, ?)";
		PreparedStatement st = null;
		
		try {
			connection = ConnectionManager.getInstance().getConnection();
			
			st = connection.prepareStatement(query);
			st.setInt(1, 10);
			st.setString(2, "Descrizione linea 10");
			st.setFloat(3, 4567.89f);
			
			st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) { }
		}
	}

}
