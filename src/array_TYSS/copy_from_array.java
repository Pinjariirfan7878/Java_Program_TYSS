package array_TYSS;

public class copy_from_array {
	
	public static void main(String[] args) {
		
	int a[]= {10,20,30,40,50};
	int size=a.length;
	
	int b[]=new int[size];
	
	for(int i=0;i<size;i++)
	{
		b[i]=a[i];
	}
	
	for (int j=0;j<b.length;j++)
	{
		System.out.print(b[j]+" ");
	}

}
}