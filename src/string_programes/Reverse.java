package string_programes;

public class Reverse {
	public static void main(String[] args) {
		
		String s="hydrabad";
		char [] s1=s.toCharArray();
		
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		
	}

}
 //One more WAY we can do

//      String s="hydreabad";
//         for (int i=s.length()-1;i>=0;i++)
//         {
//	       System.out.println(s.charAt(i));
//         }