package array_TYSS;

public class secaond_max {
	public static void main(String[] args) {

		int a[]= {10,45,75,65,40,11,24,44};

		int max=0;
		int secmax=0;

		for (int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secmax=max;
				max=a[i];
			}
			else if(secmax<a[i])
			{
				secmax=a[i];
			}

		}
		System.out.println(max);
		System.out.println(secmax);
	}
}