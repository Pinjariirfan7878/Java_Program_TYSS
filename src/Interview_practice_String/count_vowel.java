package Interview_practice_String;

public class count_vowel {

	public static void main(String[] args) {
		
		String s="automation";
		char []ch=s.toCharArray();
        int count=0;
        
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
				{
					count++;
			}

		}
			System.out.println(count);
	}




	}


