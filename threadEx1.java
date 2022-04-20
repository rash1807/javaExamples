package week2;
class Ab extends Thread
{
	public void run()
	{
		try {
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
				System.out.println("catched");
		}
	}
}

class Ab1 extends Thread
{
	public void run()
	{
		try {
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
				System.out.println("catched");
		}
	}
}
public class threadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ab b= new Ab();
		b.start();
		Ab1 b1= new Ab1();
		b1.start();
	}

}
