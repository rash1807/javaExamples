package week2;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hs=new HashMap();
		hs.put(1,"Rashmi");
		hs.put(2,"Prathiksha");
		hs.put(3,"Rakhi");
		hs.put(3,"cbsajkc");
		
		Set s=hs.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
		
	}

}
