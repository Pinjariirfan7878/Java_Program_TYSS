package Interview_practice_String;

import java.util.Arrays;

public class same_position_rev {

	public static void main(String[] args) {
		String s="hello how are you";
		
		String s1[]=s.split(" ");
		System.out.println(Arrays.toString(s1));
		
		for(int i=0;i<s1.length;i++)
		{
			String value=s1[i];
			String rev="";
			
			for(int j=0;j<value.length();j++)
			{
				rev=value.charAt(j)+rev;
			}
			System.out.print(rev+" ");
		}
		

	}

}
