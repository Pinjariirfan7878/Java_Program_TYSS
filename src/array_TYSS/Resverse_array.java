package array_TYSS;

import java.util.Arrays;

public class Resverse_array {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50,60};

		int start=0;
		int end=a.length-1;
		int temp;
		System.out.println(Arrays.toString(a));

		for (int i=0;i<a.length;i++)
		{
			if(start<end)
			{
				temp=a[start];
				a[start]=a[end];
				a[end]=temp;

				start++;
				end--;
			}

		}
		System.out.println(Arrays.toString(a));



	}

}
