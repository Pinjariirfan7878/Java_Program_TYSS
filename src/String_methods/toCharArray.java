package String_methods;

public class toCharArray {

	public static void main(String[] args) {
		
		
		String s="bhahubali is an avenger";
		String s1=s.replace(" ","");
		char [] ch =s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		
	}
}
