package Interview_practice_String;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class rev_linkedlist {

	
	public static void main(String[] args) {
		
		
		LinkedList l_e=new LinkedList();
		l_e.add("Irfan");
		l_e.add("Irfa");
		l_e.add("Irf");
		l_e.add("Ir");
		l_e.add("rfan");
		l_e.add("fan");
		
		System.out.println(l_e);
		
//		for(int i=l_e.size()-1;i>=0;i--)
//		{
//			System.out.println(l_e[i]+" ");
//		}
		
		ListIterator j = l_e.listIterator();
		
		while(j.hasNext())
		{
			System.out.print(j.next()+" ");
		}
		System.out.println();
		while(j.hasPrevious())
		{
			System.out.print(j.previous()+" ");
		}
		
	}
}
