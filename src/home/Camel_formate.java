package home;

import java.util.Arrays;

public class Camel_formate {
	
	public static void main(String[] args) {
		
		String s="my name is irfan";//My Name Is Irfan
		String []s1=s.split(" ");
		String word="";
		System.out.println(Arrays.toString(s1));
		
		for(int i=0;i<s1.length;i++)
		{
			String value=s1[i];
			
			for(int j=0;j<value.length();j++)
			{
				String v1=value.substring(0, 1).toUpperCase();
				String v2=value.substring(1);
			    word=v1+v2;
			}
			
			System.out.print(word+" ");
			
			
		}
		
		
	}

}
