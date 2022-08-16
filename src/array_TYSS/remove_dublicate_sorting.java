package array_TYSS;

import java.util.Arrays;

public class remove_dublicate_sorting {

	public static void main(String[] args) {


		int a[]= {10,21,20,20,40,54,55,54};

		for (int i=0;i<a.length-1;i++)
		{
			int t;
			for(int m=1;m<a.length-1;m++)
			{
				
					if(a[m]==a[m+1] )
					{
						t=a[m];
						a[m]=a[m+1];
						a[m+1]=t;
					}
				}
			}
			
		System.out.println(Arrays.toString(a));
	}

}
