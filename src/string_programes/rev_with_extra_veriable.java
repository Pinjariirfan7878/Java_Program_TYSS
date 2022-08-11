package string_programes;

public class rev_with_extra_veriable {

	public static void main(String[] args) {

		String s="Irfan";

		String rev="";

		for (int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
//one more way

//         String s="Irfan";
//
//         String rev="";
//
//         for (int i=0;i<s.length();i--)
//        {
//        	rev=s.charAt(i)+rev;
//         }
//            System.out.println(rev);
