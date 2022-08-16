package string_programes;

import java.util.Arrays;

public class swaping_word_string {

	public static void main(String[] args) {

		String s="welcome to testyantra hydrabad";
		String []s1=s.split(" ");
		int start=0;
		int end=s1.length-1;
		String temp="";

		temp=s1[start];
		s1[start]=s1[end];
		s1[end]=temp;
		System.out.println(Arrays.toString(s1));



	}

}
