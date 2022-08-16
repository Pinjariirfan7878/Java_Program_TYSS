package home;

import java.util.Scanner;

public class odd_even_sum {
	

public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int osum=0,esum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				esum=esum+a[i];
			}
			else
			{
				osum=osum+a[i];
			}
		}
		System.out.println(esum);
		System.out.println(osum);

}
}