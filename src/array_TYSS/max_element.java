package array_TYSS;

public class max_element {

	public static void main(String[] args) {

		int a[]= {10,200,30,40,50};
		int max=0;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
