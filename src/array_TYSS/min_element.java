package array_TYSS;

public class min_element {
	public static void main(String[] args) {
		int a[]= {10,20,30,4,50};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum value in array is : "+min);
	}

}
