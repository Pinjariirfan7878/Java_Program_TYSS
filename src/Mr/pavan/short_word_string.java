package Mr.pavan;

public class short_word_string {

	public static void main(String[] args) {
		
		String s="hello who are you ";
		String []s1=s.split(" ");
		int min=s1[0].length();
		String word="";
		
		for(int i=0;i<s1.length;i++)
		{
			String sv=s1[i];
			int len=sv.length();
			
			if(len<min)
			{
				min=len;
				word=sv;
			}
		}
		System.out.println(word+" "+min);
	}

}
