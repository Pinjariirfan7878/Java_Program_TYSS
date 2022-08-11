package string_programes;

public class a_e_count {
	public static void main(String[] args) {

		String s="java tester";
		int a_count=0;
		int e_count=0;
		for (int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);

			if(ch=='a' || ch=='A')
			{
				a_count++;
			}
			else if (ch=='e' || ch=='E')
			{
				e_count++;
			}
		}
		System.out.println("a count is : "+a_count);
		System.out.println("e count is : "+e_count);

	}
}
