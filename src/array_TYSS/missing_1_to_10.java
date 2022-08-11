package array_TYSS;

public class missing_1_to_10 {

	public static void main(String[] args) {
		int a[]= {1,3,5,6,7,9};
		boolean x=true;

		for(int i=1;i<=10;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==a[j])
				{
					x=false;
					break;
				}
			}
			if(x==true)
			{
				System.out.print(i+" ");
			}
			x=true;
		}




	}
}
