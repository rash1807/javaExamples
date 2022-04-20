package week2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcEx3 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Pass@123");
			Statement smt=con.createStatement();
			//ResultSet rs=smt.executeQuery("select * from emp where desig='CEO' ");
			Scanner sc=new Scanner(System.in);
			ResultSet rs=smt.executeQuery("select * from emp where desig=? ");
			System.out.println("Enter designation");
			String desi=sc.next();
			
			while(rs.next())
			{
				System.out.println(rs.getInt("ID")+":"+rs.getString(2)+":"+rs.getInt(3));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		finally
		{
			con.close();
		}

	}

}
