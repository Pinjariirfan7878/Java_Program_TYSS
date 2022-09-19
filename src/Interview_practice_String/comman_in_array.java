package Interview_practice_String;

public class comman_in_array {

	public static void main(String[] args) {
		
		int a[]= {5,55,45,75,35,46,15,65};
		int b[]= {5,12,4,47,58,44,66,65};
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
