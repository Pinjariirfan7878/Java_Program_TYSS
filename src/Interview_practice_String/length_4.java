package Interview_practice_String;

import java.util.Arrays;

public class length_4 {
	public static void main(String[] args) {
		
		
		String s="java selenium java";
		String s1[]=s.split(" ");
		System.out.println(Arrays.toString(s1));
	
		for(int i=0;i<s1.length;i++)
		{
			String value=s1[i];
			int len=value.length();
			
			if(len==4)
			{
				System.out.println(s1[i]+" ");
			}
		}
		
		
	}

}
