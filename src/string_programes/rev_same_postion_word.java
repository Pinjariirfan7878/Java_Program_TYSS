package string_programes;

public class rev_same_postion_word {

	public static void main(String[] args) {

		String s="welcome to automation";
		String []s1=s.split(" ");

		for(int i=0;i<s1.length;i++)
		{
			String str=s1[i];
			String rev="";

			for(int j=str.length()-1;j>=0;j--)
			{
				rev=rev+str.charAt(j);
			}
			System.out.print(rev+" ");
		}
	}
}
