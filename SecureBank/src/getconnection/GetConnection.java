package getconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	public Connection GetConnection() throws ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/securebank";
		String user = "root";
		String pass = "K@r4n";
		Connection connection = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			connection = DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}

