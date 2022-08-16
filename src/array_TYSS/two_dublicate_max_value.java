package array_TYSS;

import java.util.Arrays;

public class two_dublicate_max_value {
	public static void main(String[] args) {

		int a[]= {509,10000,650,10000,600,90};
		int max=a[0];
		int secmax=a[0];

		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length;i++)
		{
			if(a[i]>=max)
			{
				if(a[i]!=max)
				{
					secmax=max;
				}
				max=a[i];
			}
			else if (secmax<a[i] || max==secmax)
			{  
				secmax=a[i];
			}

		}
		System.out.println(max);
		System.out.println(secmax);

	}
}