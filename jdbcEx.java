package week2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcEx {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Pass@123");
			Statement smt=con.createStatement();
			//smt.execute("insert into emp values(3,'Sarthak',300000,26,'Dev','5678192')");
			smt.execute("delete from emp where id=3");
			con.close();
			System.out.println("Data deleted");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
	}

}
