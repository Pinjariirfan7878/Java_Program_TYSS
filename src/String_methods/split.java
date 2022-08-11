package String_methods;

import java.util.Arrays;

public class split {
	public static void main(String[] args) {
		
		String s="hi irfan Welcome to autromation world";
		String [] arr=s.split(" ");
		
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		String i="Welcome";
		String[] i1=i.split("l", 2);
		
		for (int j=0;j<i1.length;j++)
		{
			System.out.println(i1[j]);
		}
	}

}
