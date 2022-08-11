package array_TYSS;

import java.util.Arrays;

public class apnet_ZERO_FIRST {

	public static void main(String[] args) {
		int a[]= {1,0,0,1,0,0,2,0,4};
		int size=a.length;

		int b[]=new int[size];
		int start=0;
		int end =a.length-1;

		for(int i=0;i<size;i++)
		{
			if(a[i]==0)
			{
				b[start]=a[i];
				start++;
			}
			else 
			{
				b[end]=a[i];
				end--;
			}
		}

		System.out.println(Arrays.toString(b));
		for(int m=0;m<b.length-1;m++) {
			int t;
			for(int j=0;j<b.length-1;j++ ) {
				if(b[j]>b[j+1])
				{
					t=b[j];
					b[j]=b[j+1];
					b[j+1]=t;
				}
			}

		}
		System.out.println(Arrays.toString(b));
	}

}
