package object_class;

public class Equals_Object_address {
	
	String a;
	String b;

	Equals_Object_address(String a,String b)
	{
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "Equals [a=" + a + ", b=" + b + "]";
	}

	public static void main(String[] args) {
		
		Equals_Object_address eq=new Equals_Object_address("irfan", "irfan");
		System.out.println(eq);
		Equals_Object_address eq1=new Equals_Object_address("ram", "irfan");
		System.out.println(eq1);
		Equals_Object_address eq2=new Equals_Object_address("irfan", "irfan");
		System.out.println(eq2);
		
		//equal will compare address of object only NO USE For us
		System.out.println(eq.equals(eq1));
		eq=eq2;
		System.out.println(eq.equals(eq2));
		
		System.out.println(eq.equals(eq));
	}
	
    

}
