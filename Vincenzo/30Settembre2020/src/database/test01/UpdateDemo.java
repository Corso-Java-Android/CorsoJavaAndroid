package database.test01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.exceptions.MyDatabaseException;
import database.util.ConnectionManager;

public class UpdateDemo {

	public static void main(String[] args) throws MyDatabaseException {
		Connection connection = null;
		String query = "update tab01 set descrizione = ?, valore = ? where id = ?";
		PreparedStatement st = null;

		try {
			connection = ConnectionManager.getInstance().getConnection();
			st = connection.prepareStatement(query);
			st.setString(1, "Questa descrizione è stata modificata");
			st.setFloat(2, 42.21f);
			st.setInt(3, 11);	//modifica il record creato con InsertDemo

			int i = st.executeUpdate();
			System.out.println("Sono state modificate "+i+" righe.");
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
