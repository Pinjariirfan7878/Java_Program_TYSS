package home;

public class missing_1_10 {
	
	public static void main(String[] args) {
		
		
		int a[]= {1,3,5,7,9};
		boolean x=true;
		
		for(int n=1;n<=10;n++)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==n)
				{
					x=false;
					break;
				}
			}
				if(x==true)
				{
					System.out.print(n);
				}
				x=true;
			
		}
	}

}
