package string_programes;

public class add_from_string {

	public static void main(String[] args) {


		String s="a11b22c33";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{

			char ch=s.charAt(i);
			if(ch>='0' && ch<='9' )
			{
				int chart=s.charAt(i)-48;	//ascii value
				sum=sum+chart;	
			}
		}
		System.out.println(sum);
	}

}
