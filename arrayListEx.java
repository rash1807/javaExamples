package week2;
import java.util.*;
class Ad
{
	
}
public class arrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ad b=new Ad();
		ArrayList a=new ArrayList();
		LinkedList al=new LinkedList();
		al.addFirst(100);
		al.addLast(390);
		al.set(0, 20);
		a.add("Rashmi");
		a.add(1);
		a.add(20000);
		a.add(b);
		System.out.println(a);
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
