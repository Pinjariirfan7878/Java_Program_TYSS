package array_TYSS;

import java.util.Arrays;
import java.util.Scanner;

public class desending_order {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter array value");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
		
		for (int m=0;m<a.length-1;m++)
		{
			int t;
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
