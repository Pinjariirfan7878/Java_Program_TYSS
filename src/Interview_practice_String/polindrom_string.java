package Interview_practice_String;

public class polindrom_string {
	
	
	public static void main(String[] args) {
		String s="madam";
		String temp=s;
		String rev="";

		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(temp))	
		{
			System.out.println(temp+" strig is polindron");
		}
		else
		{
			System.out.println(temp+" strig is not polindron");
		}


}
}
