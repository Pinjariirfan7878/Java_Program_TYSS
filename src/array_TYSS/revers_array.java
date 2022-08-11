package array_TYSS;

import java.util.Arrays;
import java.util.Scanner;

public class revers_array {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("enter the value of array");
	
	for (int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();	
	}
	
	System.out.println(Arrays.toString(a));
	
	for (int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println(Arrays.toString(a));

}
}