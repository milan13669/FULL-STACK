package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class datamanager {
	private static Connection con;
	public static Connection getConnect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","milan131198");
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return con;
	}

}
