package string_programes;

import java.util.Arrays;

public class Initcap_stringArray {

	public static void main(String[] args) {

		String s="welcome to india";
		String []s1=s.split(" ");
		String value="";
		for(String ss:s1)
		{
			value=ss.substring(0, 1).toUpperCase()+ss.substring(1);
			System.out.print(value+" ");
		}
		
	}
}
