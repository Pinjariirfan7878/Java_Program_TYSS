package Wrapper_classes;

public class parse_method_of_wrapperclass {


	public static void main(String[] args) {

   // String to int converting
		String s="1230";
		int i=Integer.parseInt(s);
		System.out.println(i);

		String m="true";
		boolean m1=Boolean.parseBoolean(m);
		System.out.println(m1);
		
		//converting int to string
		
		int j=25;
		System.out.println(j+21);
		
		String str=String.valueOf(j);
		
		System.out.println(str+21);
	}
}
