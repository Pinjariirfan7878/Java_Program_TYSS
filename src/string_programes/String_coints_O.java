package string_programes;

import java.util.Arrays;

public class String_coints_O {
	
	public static void main(String[] args) {
		
		
		String s="hello who are you";
		String []s1=s.split(" ");
		System.out.println(Arrays.toString(s1));
		
		for(int i=0;i<s1.length;i++)
		{
			String value=s1[i];
			
			if(value.contains("o"))
			{
				System.out.println(value);
			}
		}
		}

}
