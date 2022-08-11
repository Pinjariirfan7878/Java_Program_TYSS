package string_programes;

public class palindrome_string {

	public static void main(String[] args) {
		
		String s="mada";
		String temp=s;
		String rev="";
		
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(temp))
		{
			System.out.println("The given string "+temp+" is a polindrome");
		}
		else
		{
			System.out.println("The given string "+temp+" is not a polindrome");

		}
	}

}
