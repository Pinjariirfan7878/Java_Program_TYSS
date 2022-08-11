package string_programes;

public class count_vowel_array {

	public static void main(String[] args) {

		String[]s= {"raman","irfan","sudheer","nagamani"};

		
		for(int i=0;i<s.length;i++)
		{
			String value=s[i];
			
			int count=0;
			
			for(int j=0;j<value.length();j++)
			{
				char ch=value.charAt(j);
				if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u')
				{
					count++;
				}

			}
			System.out.println(value+"-"+count+" ");
		}
	}
}
