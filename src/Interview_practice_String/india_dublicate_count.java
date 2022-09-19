package Interview_practice_String;

import java.util.LinkedHashSet;

public class india_dublicate_count {
	
	
	public static void main(String[] args) {
		
		
		String s="india";
		
		LinkedHashSet<Character> l=new LinkedHashSet();
		
		for(int i=0;i<s.length();i++)
		{
			l.add(s.charAt(i));
			
		}
		System.out.println(l);
		int count=0;
		for(Character one:l)
		{
			if(one=='i' || one=='a')
			{
				count++;
			}
		}
		System.out.println(s+" "+count);
		
	}

}
