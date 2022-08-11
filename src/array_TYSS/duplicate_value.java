package array_TYSS;

public class duplicate_value {

	public static void main(String[] args) {

		int a[]= {30,20,21,20,31,40,30,40};

		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}