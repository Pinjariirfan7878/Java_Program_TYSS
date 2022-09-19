package Interview_practice_String;

public class last_o {

	public static void main(String[] args) {
		
		String s="hello who are you";
		String []s1=s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			String value=s1[i];
			
			if(value.charAt(value.length()-1)=='o')
			{
				System.out.println(s1[i]+" ");
			}
			
		}
	}

}
