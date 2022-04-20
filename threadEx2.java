package week2;

class Ab3 extends Thread
{
	public synchronized void run()
	{
		try {
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+": "+i);
			Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
				System.out.println("catched");
		}
	}
}

public class threadEx2 {

	public static void main(String args[])
	{ 
		Ab3 a1=new Ab3();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a1);
		
		t1.start();
		t2.start();
		t1.setName("Rashmi");
		t2.setName("Gupta");
		t1.setPriority(8);
		
	}
}
