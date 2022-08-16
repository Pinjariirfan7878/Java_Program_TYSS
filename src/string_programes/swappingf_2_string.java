package string_programes;

public class swappingf_2_string {
	
	public static void main(String[] args) {
		
		
		String a="Irfan";
		String b="raman";
		
		//ONE WAY
//		String temp="";
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println(a);
//		System.out.println(b);
	
		//SCECOND WAY

		a=a+b;//Irfanraman
		System.out.println(a);
		b=a.substring(0,a.length()-b.length());
		System.out.println("b = "+b);
		a=a.substring(b.length());
		System.out.println("a = "+a);

		
	
	}

}
