package array_TYSS;

import java.util.Arrays;
import java.util.Scanner;

public class odd_even_position_sum {
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
		int eposition_sum=0,oposition_sum=0;
		for (int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				eposition_sum=eposition_sum+a[i];
			}
			else 
			{
				oposition_sum=oposition_sum+a[i];
			}
		}
		System.out.println("Sum of even num of array "+eposition_sum);
		System.out.println("Sum of odd num of array "+oposition_sum);

	}
}
