package database.test01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.exceptions.MyDatabaseException;
import database.util.ConnectionManager;

public class DeleteDemo {

	public static void main(String[] args) throws MyDatabaseException {
		Connection connection = null;
		String query = "delete from tab01 where id = ?";
		PreparedStatement st = null;
		
		try {
			connection = ConnectionManager.getInstance().getConnection();
			st = connection.prepareStatement(query);
			
			st.setInt(1, 11);	//cancella il record creato con InsertDemo
			int i = st.executeUpdate();
			System.out.println("Sono state cancellate "+i+" righe.");
			return;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyDatabaseException(e);
		}finally {
			System.out.println("eseguito in ogni caso ...");
			try { st.close(); } catch (Exception e) {}
			try { connection.close(); } catch (Exception e) {}
		}	


	}

}
