package String_methods;

import java.util.Arrays;

public class occurence {
	
	public static void main(String[] args) {
		
		String s="aaabbcc";
		char s2[]=s.toCharArray();
		System.out.println(Arrays.toString(s2));
		
		for(char ch='a';ch<='z';ch++)
		{
			int coun=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s2[i])
				{
					coun++;
				}
				
			}
			if(coun>0)
			{
				System.out.print(ch+""+coun+" ");
			}
			
		}	
		
	}

}
