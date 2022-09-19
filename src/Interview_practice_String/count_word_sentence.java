package Interview_practice_String;

import java.util.Arrays;

public class count_word_sentence {

	public static void main(String[] args) {
		
		String s="hi irfan welcome to automation";
		String[]s1=s.split(" ");
		
		System.out.println(Arrays.toString(s1));
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			count++;
			System.out.println(s1[i]+" ");
		}
            System.out.println(count);
	}

}
