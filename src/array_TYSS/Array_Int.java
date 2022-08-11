package array_TYSS;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Int {
	
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		String a[]=new String[size];
		System.out.println("enter the value of array");
		
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.next();	
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
