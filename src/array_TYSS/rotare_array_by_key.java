package array_TYSS;

import java.util.Arrays;

public class rotare_array_by_key {
	public static void main(String[] args) {
		
		
		
		int a[]= {1,2,3,5,6};
		int key=2;
		
		for(int i=0;i<key;i++)
		{
			int t;
			for(int j=0;j<a.length-1;j++)
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
