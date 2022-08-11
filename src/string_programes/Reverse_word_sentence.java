package string_programes;

public class Reverse_word_sentence {
	public static void main(String[] args) {


		String s="I am in testyantra hyderabad";
		String []s1=s.split(" ");

		//char ch[]=s.toCharArray();

		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
	}

}
//one more way



