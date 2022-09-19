package Mr.pavan;

import java.util.Arrays;

public class bubble_sort {

	public static void main(String[] args) {

		int a[]= {10,20,5,7,11,45,75,84,100,4};

		int temp=0;

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
