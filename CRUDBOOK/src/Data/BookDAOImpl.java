package Data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDAOImpl implements BookDAOInterface {
	Connection con = DataManger.getConnect();
	@Override
	public ArrayList<Book> getAllBooks(){
		ArrayList<Book> blist = new ArrayList<Book>();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from book");
		while (rs.next())
		{
			
		}
		
	}

}
