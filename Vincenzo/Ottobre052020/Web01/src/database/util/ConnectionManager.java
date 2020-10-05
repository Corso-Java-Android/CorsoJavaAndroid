package database.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {
	private static final String DRIVER_NAME = "org.mariadb.jdbc.Driver";
	private static final String DATABASE_URL = "jdbc:mariadb://localhost:3306/master?user=master&password=master";
	private static ConnectionManager instance = null;

	static {
		try {
			Class.forName(ConnectionManager.DRIVER_NAME);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(-1);

		}
	}

	private ConnectionManager(){ }

	public static final ConnectionManager getInstance() { 
		if(instance==null)
			instance = new ConnectionManager();
		return instance; 
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(ConnectionManager.DATABASE_URL);
	}

}
