package Interview_practice_String;

public class longest_word {

	public static void main(String[] args) {
		
		String s="hello who are you";
		String s1[]=s.split(" ");
		int max=0;
		String word="";
		
		for(int i=0;i<s1.length;i++)
		{
			String value=s1[i];
			int len=s1[i].length();
			if(len>max)
			{
				max=len;
				word=value;
			}
		}
     System.out.println(max+" "+word);
	}

}
