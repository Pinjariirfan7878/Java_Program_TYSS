package map_Interface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class hashmap {
	public static void main(String[] args) {
		
HashMap<String,Integer> ht=new HashMap<String,Integer>();
		
		ht.put("Irfan", 7878797);
		ht.put("raman",5555);
		ht.put("sai", 3333);
		ht.put("manish", 22222);
		ht.put("sudeer", 11111);
		System.out.println(ht);
		
		Set set=ht.entrySet();
		Iterator i=set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
