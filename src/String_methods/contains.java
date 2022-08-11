package String_methods;

public class contains {
	
	public static void main(String[] args) {
		
		
		String s="Automation Manual testing";
		
		System.out.println(s.contains("a"));
		System.out.println(s.contains("M"));
		System.out.println(s.contains("t"));
		System.out.println(s.contains("z"));
		
		String value="ing";
		System.out.println(s.contains(value));
	}

}
