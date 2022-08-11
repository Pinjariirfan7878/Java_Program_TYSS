package string_programes;

public class Frequency_chara {
	public static void main(String[] args) {
		
		
		String s="aaaaabcda";
		
		char []s1=s.toCharArray();
		
		for(char ch='a';ch<='z';ch++)
		{
			int count=0;
			for(int i=0;i<s1.length;i++)
			{
				if(ch==s1[i])
				{
					count++;
				}
			}
			if(count>0)
			System.out.println("count of "+ch+"-"+count);
		}
	
		
	}

}
