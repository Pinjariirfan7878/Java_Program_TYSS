package String_methods;

public class StringBuffer_ {

	public static void main(String[] args) {

		StringBuilder sbf=new StringBuilder("Irfan");
		System.out.println(sbf);

		sbf.append("Pinjari");//permanent
		System.out.println(sbf);

		StringBuffer sbff=new StringBuffer("Irfan");
		System.out.println(sbff);
		sbff.append("Pinajri");
		System.out.println(sbff);

	}

}
