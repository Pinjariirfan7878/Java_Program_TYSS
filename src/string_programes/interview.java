package string_programes;

import java.util.Arrays;

public class interview {
	
	public static void main(String[] args) {
		
		
		String s="javaselenuimjavamanualjava";
		String s1[]=s.split("va");
		System.out.println(Arrays.toString(s1));
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].contains("ja"))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
  