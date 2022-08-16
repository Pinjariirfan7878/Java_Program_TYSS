package string_programes;

public class remove_dublicate {
	public static void main(String[] args) {
		
		String s="aaaabcdeef";
		String un="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(un.indexOf(ch)==-1)
			{
				un=un+ch;
			}
		}
		System.out.println(un);
	}

}
