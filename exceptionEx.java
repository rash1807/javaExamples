/* package week2;
import java.util.*;
import java.io.*;
public class exceptionEx {

	public static void main(String[] args)  //throws FileNotFoundException
		// TODO Auto-generated method stub
		{
			m1();
		}
		public static void m1()
		{
			m2();
		}
		public static void m2()
		{
			try
			{
				File f=new File("abc.txt");
				FileReader fr=new FileReader(f);
		    }
			catch(FileNotFoundException e)
			{
				System.out.println("catched");
			}

	}


} */



package week2;
import java.util.*;
import java.io.*;
public class exceptionEx {

	public static void main(String[] args)  throws FileNotFoundException
		// TODO Auto-generated method stub
		{
			m1();
		}
		public static void m1() throws FileNotFoundException
		{
			m2();
		}
		public static void m2() throws FileNotFoundException
		{
			
				File f=new File("abc.txt");
				FileReader fr=new FileReader(f);
	    }
}
