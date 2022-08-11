package array_TYSS;

import java.util.Arrays;

public class Two_maximun_number {

	public static void main(String[] args) {

		int a[]= {509,10000,600,10000,600,90};
		int max1=0;
		int max2=0;

		for (int m=0;m<a.length-1;m++)
		{
			int t;
			for(int i=0;i<a.length-1;i++)

				if(a[i]>a[i+1])
				{
					t=a[i];
					a[i]=a[i+1];
					a[i+1]=t;
				}
		}
		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			else if (a[i]>max2)
			{
				max2=a[i];
			}

		}
		System.out.println(max1);
		System.out.println(max2);
	}

}
