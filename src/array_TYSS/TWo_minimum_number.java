package array_TYSS;

import java.util.Arrays;

public class TWo_minimum_number {

	public static void main(String[] args) {
		
		
		int a[]= {70,40,60,17,10,20,80};

		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	     System.out.println("second Min value is :"+a[a.length-2]);
	     System.out.println("Min value is :"+a[a.length-1]);
		
	}
}
