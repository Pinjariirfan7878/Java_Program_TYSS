package string_programes;

public class reverse_without_length {

	public static void main(String[] args) {

		String s="Automation";

		char ch[]=s.toCharArray();
		int count=0;
		for(char c:ch)
		{
			count++;
		}
		
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(ch[i]+" ");
		}

	}
}