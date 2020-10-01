package database.test01;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FirstConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "org.mariadb.jdbc.Driver";
		
		Class.forName(driver);
		
		Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/master?user=master&password=master");
		
		String query = "select id, nome from regioni";
		
		Statement st = connection.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.print("id=");
			System.out.print(rs.getInt("id"));
			System.out.print(" ");
			System.out.print("regione=");
			System.out.println(rs.getString(2));
		}
		
		rs.close();
		st.close();
		connection.close();
	}

}
