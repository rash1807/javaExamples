
package week2;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcEx2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Pass@123");
			//Statement smt=con.createStatement();
			//smt.execute("insert into emp values(3,'Sarthak',300000,26,'Dev','5678192')");
			//smt.execute("delete from emp where id=3");
			//PreparedStatement ps = con.prepareStatement("delete from emp where id=?");
			PreparedStatement ps = con.prepareStatement("update emp set name=? where id=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id");
			int id=sc.nextInt();
     		System.out.println("Enter name");
		    String name=sc.next();
//		    System.out.println("Enter salary");
//			int salary=sc.nextInt();
//			System.out.println("Enter age");
//			int age=sc.nextInt();
//			System.out.println("Enter desig");
//			String desig=sc.next();
//			System.out.println("Enter PAN");
//			int pan=sc.nextInt();
//			
			ps.setString(1, name);
     		ps.setInt(2, id);
//			ps.setInt(3, salary);
//			ps.setInt(4, age);
//			ps.setString(5, desig);
//			ps.setInt(6, pan);
      		ps.execute();
			System.out.println("Data updated");
			
			
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
