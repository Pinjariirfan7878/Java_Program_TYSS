package Interview_practice_String;

import java.util.ArrayList;
import java.util.ListIterator;


public class rev_arraylist {
	
	public static void main(String[] args) {
		
		ArrayList a_l=new ArrayList();
		a_l.add(10);
		a_l.add(5);
		a_l.add(100);
		a_l.add(20);
		a_l.add(30);
		a_l.add(90);
		System.out.println(a_l);
		
		for(int i=a_l.size()-1;i>=0;i--)
		{
			System.out.print(a_l.get(i)+" ");
		}
		
		ListIterator i=a_l.listIterator();
		while(i.hasNext()) {
		System.out.println(i.next());	
		}
		System.out.println("reverse");
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
	}

}
