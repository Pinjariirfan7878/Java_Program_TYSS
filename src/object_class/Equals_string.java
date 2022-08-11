package object_class;

import java.util.Objects;

public class Equals_string {
	String a;
	String b;

	Equals_string(String a,String b)
	{
		this.a=a;
		this.b=b;
	}


	@Override
	public String toString() {
		return "Equals_string [a=" + a + ", b=" + b + "]";
	}


	@Override
	public boolean equals(Object obj) {
		
		Equals_string other = (Equals_string) obj;
		return Objects.equals(a, other.a) && Objects.equals(b, other.b);
	}

	public static void main(String[] args) {

		Equals_string eq=new Equals_string("irfan", "irfan");
		System.out.println(eq.a+"***"+eq.b);
		Equals_string eq1=new Equals_string("ram", "irfan");
		System.out.println(eq1.a+"***"+eq1.b);
		Equals_string eq2=new Equals_string("irfan", "irfan");
		System.out.println(eq2.a+"***"+eq2.b);

		System.out.println(eq.equals(eq2));
		System.out.println(eq);


	}
}