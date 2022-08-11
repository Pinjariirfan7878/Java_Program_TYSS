package String_methods;

public class create_string_with_newkeyword {
	
	
	public static void main(String[] args) {
		
		String s=new String("Hyb");
		System.out.println(s);
		String s1=new String ("Hyb");
		
		System.out.println(s1);
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		String s2=new String ("Bng");
		System.out.println(s2==s1);
		System.out.println(s2==s);
		
		String s3="Irfan";

		String s4="Irfan";
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}

}
