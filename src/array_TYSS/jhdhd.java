package array_TYSS;

public class jhdhd {
	
	public static void main(String[] args) {
		
		
		int s=123;
		int rev=0;
		int rem=0;
		
		while(s>0)
		{
			rem=s%10;
			s=s/10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
	}

}
