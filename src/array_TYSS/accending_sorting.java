package array_TYSS;

public class accending_sorting {

	public static void main(String[] args) {


		int a[]= {1,4,1,9,1,10,111,250};

		for (int m=0;m<a.length-1;m++)
		{
			int t;
			for(int i=0;i<a.length-1;i++)

				if(a[i]>a[i+1])
				{
					t=a[i];
					a[i]=a[i+1];
					a[i+1]=t;
					
//					a[i]=a[i]+a[i+1];
//					a[i+1]=a[i]-a[i+1];
//					a[i]=a[i]-a[i+1];

				}
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
		
	}

}
