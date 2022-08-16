package string_programes;

import java.util.Arrays;

public class last_o_word_print {
	public static void main(String[] args) {
		
		
		String s="hello who are you";
		String s2="hello,who are you";
		String []s1=s.split(" ");
		String s88=s.replace(",", " ");
		
		String []s3=s88.split(" ");
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s3));
		
		
//		for (int i=0;i<s1.length;i++)
//		{
//			String value=s1[i];
//			if(value.charAt(value.length()-1)=='o')
//			{
//				System.out.println(value);
//			}
//			
//		}
		
	}

}
