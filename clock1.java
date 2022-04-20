package week2;
import java.util.Locale;
class Ab2 extends Thread
{
	static int hr=0,min1=0,sec=0;
	public void run()
	{
		try {
		for(int i=0;i<=1000;i++)
		{
		
			if(sec==60) {
				sec=0;
				min1++;
			}
			else if(min1==60)
			{
				sec=0;
				min1=0;
				hr++;
			}
		//	System.out.println(String.format(Locale.getDefault(),"%02d:%02d:%02d", hr,min1,sec));
		//	System.out.print("Time is: " + String.format("%02d", hr) + ":" + String.format("%02d", min1) +":" +
				//	String.format("%02d", sec) + "\r");
			sec++;
			Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
				System.out.println("catched");
		}
	}
}
public class clock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ab2 b= new Ab2();
		b.start();
		

	}

}