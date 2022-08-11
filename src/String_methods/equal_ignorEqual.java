package String_methods;

public class equal_ignorEqual {
	

	public static void main(String[] args) {
		
		
		
		
		String s="Automation";
		String s1="Manaual";
		String s2="Automation";
		String s3="autoMation";
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s.equalsIgnoreCase(s3));
		

	}
	
}
