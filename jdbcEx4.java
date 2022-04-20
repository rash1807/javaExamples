package week2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcEx4 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Pass@123");
			Statement smt=con.createStatement();
			//ResultSet rs=smt.executeQuery("select * from emp where desig='CEO' ");
			
			String sql="select * from emp";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			
			System.out.println("id\t\tname\t\tsalary\t\tage\t\t\tdesig\t\tpan");
			
			while(rs.next())
			{
				int id=rs.getInt("ID");
				String name=rs.getString(2);
				int sal=rs.getInt(3);
				int age=rs.getInt(4);
				String des=rs.getString(5);
				String pan=rs.getString(6);
				
				System.out.println(id + "\t\t" + name
                        + "\t\t" + sal + "\t\t" + age
                        + "\t\t" +des+"\t\t"+pan);
				
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
