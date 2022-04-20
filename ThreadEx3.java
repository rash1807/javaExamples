package week2;

class Ab4 extends Thread
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
public class ThreadEx3 {
	public static void main(String args[])
	{ 
		Ab4 a1=new Ab4();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a1);
		
		t1.start();
		t2.start();
		t1.setName("Rashmi");
		t2.setName("Gupta");
		for(int k=0;k<=30;k++)
		{
			try {
				if(k==5) t1.suspend();
				if(k==10) t1.resume();
				if(k==15) System.out.println(t1.isAlive());
				if(k==20) t1.stop();
				if(k==24) System.out.println(t1.isAlive());
				System.out.println("       k :"+k);
				Thread.sleep(1000);
			}
			catch(Exception e) {
			System.out.println("catched");
			}
		}
	}
	
}
