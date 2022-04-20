package week2;
import java.sql.*;
import java.util.*;
import java.io.*;

class A1
{
	void abc() throws SQLException, FileNotFoundException, NullPointerException
	{
		for(int i=0;i<15;i++)
		{
			if(i==2) throw new NullPointerException();
			if(i==3) throw new ArrayIndexOutOfBoundsException();
			if(i==8) throw new NumberFormatException();
			if(i==9) throw new SQLException();
			if(i==12) throw new FileNotFoundException();
			System.out.println("I :"+i);
		}
	}
}
public class ExceptionEx2 {
 public static void main(String args[])
 {
	 try
	 {
		 A1 a1=new A1();
		 a1.abc();
	 }
	 catch(NullPointerException e)
	 {
		 System.out.println("oops NullPointerException");
	 }
	 catch(NumberFormatException e)
	 {
		 System.out.println("oops NumberFormatException");
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 System.out.println("oops ArrayIndexOutOfBoundsException");
	 }
	 catch(SQLException e)
	 {
		 System.out.println("oops SQLException");
	 }
	 catch(FileNotFoundException e)
	 {
		 System.out.println("oops FileNotFoundException");
	 }
 }
}
