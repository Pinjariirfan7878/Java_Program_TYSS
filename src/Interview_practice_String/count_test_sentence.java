package Interview_practice_String;

import java.util.Arrays;

public class count_test_sentence {
	
	public static void main(String[] args) {
		
		
		String s="hi test engineer test welcome to test word";
		String s1[]=s.split(" ");
		System.out.println(Arrays.toString(s1));
		String word="test";
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equalsIgnoreCase(word))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
