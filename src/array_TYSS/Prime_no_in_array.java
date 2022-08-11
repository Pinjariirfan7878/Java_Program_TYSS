package array_TYSS;

public class Prime_no_in_array {

	public static void main(String[] args) {
		
		int a[]= {1,10,17,19,21,377,401,13,7};

		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;;
				}
			}
			if(count==1 || count==2)
			{
				System.out.print(a[i]+" ");
			}
			
		}
		
		
	}

}
