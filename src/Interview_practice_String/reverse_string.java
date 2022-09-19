package Interview_practice_String;

public class reverse_string {

	public static void main(String[] args) {
		String s="irfan";
		String rev="";

		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
	}

}
