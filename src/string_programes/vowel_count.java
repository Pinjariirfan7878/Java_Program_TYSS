package string_programes;

public class vowel_count {

	public static void main(String[] args) {
	
		String s="Automation";
		String s1=s.toLowerCase();
		//char [] ch=s1.toCharArray();
		
		for (int i=0;i<s1.length();i++)
		{
			char ch1=s1.charAt(i);
			if (ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')
			{
				System.out.print(ch1+" ");
			}
				
		}

	}

}


