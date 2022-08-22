package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("5");
		a.add("selenium");
		a.add("10");
		a.add("9");
		a.add("java");
		
		System.out.println(a);
		
		ListIterator i=a.listIterator();
		while(i.hasNext())
		{
			 Object value = i.next();
			if (value.equals("selenium"))
			{
				i.remove();
				System.out.println(value +" is removed");
			}
		}
		for(String c:a)
		{
			System.out.print(c+" ");
		}
		
		
	}

}
