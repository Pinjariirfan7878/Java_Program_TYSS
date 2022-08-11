package array_TYSS;

import java.util.Arrays;

public class add_two_array {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40,50,60};
		int size=a.length;

		if(a.length<b.length)
		{
			size=b.length;
		}
		
		int c[]=new int[size];

		for (int i=0;i<size;i++)
		{
			try{
				c[i]=a[i]+b[i];
				System.out.print(c[i]+" ");

			}
			catch(Exception e){
				for(int j=b.length-1;j>b.length-2;j--) 
				{
					if(a.length>b.length)
					{
						c[i]=a[i];
						System.out.println(c[i]);
					}

					else
					{
						c[i]=b[i];
						System.out.println(c[i]);
					}
					System.out.println(Arrays.toString(c));
				}
			}

		}
	}

}