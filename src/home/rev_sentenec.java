package home;

public class rev_sentenec {

	public static void main(String[] args) {


		String s="welcome to hyderabad";
		String s1[]=s.split(" ");
		String rev;

		for(int i=s1.length-1;i>=0;i--)
		{
			String value=s1[i];
			rev="";
			rev=s.charAt(i)+rev;
		
		}
       
	}

}
