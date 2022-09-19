package Interview_practice_String;

import java.util.Arrays;

public class reverse_sentence {
	
	public static void main(String[] args) {
		
		String s="hello welcome to gujarat";
		String s1[]=s.split(" ");
		System.out.println(Arrays.toString(s1));
		
		
		for(int i=s1.length-1;i>=0;i--)
		{
			
			System.out.print(s1[i]+" ");
		}
		
	}

}
