package map_Interface;

import java.util.HashMap;

public class abcd {
	
	
	public static void main(String[] args) {
		
		
		String s="java";
		char ch1[]=s.toCharArray();
		
		HashMap<Character,Integer> ht=new HashMap<Character,Integer>();
		
		for(char ch='a';ch<='z';ch++)
		{
			int count=0;
			
			for(int i=0;i<ch1.length;i++)
			{
				if(ch==ch1[i])
				{
					count++;
				}
			}
			if(count>0)
				ht.put(ch,count);
		}
		System.out.println(ht);
	}

}
