package Interview_practice_String;

import java.util.Arrays;

public class freq_char_string {

	public static void main(String[] args) {
		
		String s="selenium";
		char ch1[]=s.toCharArray();
		System.out.println(Arrays.toString(ch1));
		
		for(char ch='a';ch<='z';ch++)
		{
			int count=0;
			 for(int i=0;i<s.length();i++)
			 {
				 if(ch==ch1[i])
				 {
					 count++;
				 }
			 }
			 if(count>0)
			 System.out.println(ch+" "+count);
		}
		
	}

}
