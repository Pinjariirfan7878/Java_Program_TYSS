package array_TYSS;

import java.util.Arrays;
import java.util.Scanner;

public class sum_avg_array {

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
		int sum=0;
     for (int i=0;i<a.length;i++)
     {
    	 sum=sum+a[i];
     }
		System.out.println(sum);
		
		float avg=(float)sum/a.length;
		System.out.println(avg);
		
}
}