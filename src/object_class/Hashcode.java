package object_class;

import java.util.Objects;

public class Hashcode {
	
	int a;
	String b;

	Hashcode(int a,String b)
	{
		this.a=a;
		this.b=b;
	}

		@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}

	@Override
	public boolean equals(Object obj) {
		
		Hashcode other = (Hashcode) obj;
		return a == other.a && b.equals(other.b);
	}

		public static void main(String[] args) {
		
		Hashcode hc=new Hashcode(10,"urfi");
		System.out.println(hc);
		
		Hashcode hc1=new Hashcode(10, "irfan");
		System.out.println(hc1.a+"***"+hc1.b);
		
		Hashcode hc2=new Hashcode(11, "irfan");
		System.out.println(hc2.a+"***"+hc2.b);
		
		Hashcode hc3=new Hashcode(10, "irfan");
		System.out.println(hc3.a+"***"+hc3.b);

		System.out.println(hc1.hashCode());
		System.out.println(hc3.hashCode());
		System.out.println(hc2.hashCode());
		System.out.println(hc.hashCode());

		
	}
	
	
	

}
