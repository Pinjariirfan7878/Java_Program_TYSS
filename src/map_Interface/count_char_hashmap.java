package map_Interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class count_char_hashmap {
	
	public static void main(String[] args) {
		
	String s="automation";
	char ch[]=s.toCharArray();
	System.out.println(ch);
	
	HashMap<Character,Integer> ht=new HashMap<Character,Integer>();
	
	for(char ch1='a';ch1<='z';ch1++)
	{
		int count=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch1==ch[i])
		{
			count++;
		}
		ht.put(ch[i],count);
	 }
	}
	System.out.println(ht);
	
//	ht.put('a', 7878797);
//	ht.put('u',5555);
//	ht.put("sai", 3333);
//	ht.put("manish", 22222);
//	ht.put("sudeer", 11111);
//	System.out.println(ht);
//	
//	Set set=ht.entrySet();
//	Iterator i=set.iterator();
//	
//	while(i.hasNext())
//	{
//		System.out.println(i.next());
//	}

	
	}
}
