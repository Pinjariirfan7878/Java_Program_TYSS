package string_programes;

public class longest_wordd {

	public static void main(String[] args) {
		
		String s="Hello who are you";
		String s1[]=s.split(" ");
		int max=0;
		String word="";
		
		for(int i=0;i<s1.length;i++)
		{
			String sv=s1[i];
			System.out.println(sv+"-"+sv.length());
			
			if(sv.length()>max)
			{
				max=sv.length();
				word=sv;
			}
		}
		System.out.println(word+" "+max);

	}

}
