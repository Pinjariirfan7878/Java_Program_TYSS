package map_Interface;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class hashtable {

	public static void main(String[] args) {
		
		
		Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
		
		ht.put("Irfan", 7878797);
		ht.put("raman",5555);
		ht.put("sai", 3333);
		ht.put("manish", 22222);
		ht.put("sudeer", 11111);
		System.out.println(ht);
		System.out.println(ht.entrySet());
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		System.out.println(ht.containsKey("Irfan"));
		System.out.println(ht.containsValue(7878797));
		
		Set<Entry<String, Integer>> set = ht.entrySet();
		Iterator<Entry<String, Integer>> i = set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		for(Object one:ht.entrySet())
		{
			System.out.println(one+ " ");
		}
		
	}

}
