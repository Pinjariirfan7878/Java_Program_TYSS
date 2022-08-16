package home;

import java.util.Arrays;
import java.util.Scanner;

public class first_last_element {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]+" "+a[a.length-1]);
		
	}

}
