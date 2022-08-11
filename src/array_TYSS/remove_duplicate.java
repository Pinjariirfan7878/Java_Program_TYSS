package array_TYSS;

import java.util.Arrays;

public class remove_duplicate {


	public static void main(String[] args) {


		int a[]= {1,1,2,2,5,5,8,8};

		int k=0;
		for(int i=0;i<a.length-1;i++)
		{
			if (a[i]==a[i+1])
				{
					a[k]=a[i+1];
					k++;
				}
			a[k]=a[a.length-1];
		}

//		for(int l=0;l<a.length;l++)
//		{
//			//System.out.print(a[l]+" ");
//		}
		System.err.print("\n");
		System.out.println(Arrays.toString(a));
	}
}