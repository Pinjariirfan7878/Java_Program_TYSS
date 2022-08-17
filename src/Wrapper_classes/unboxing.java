package Wrapper_classes;

public class unboxing {


	public static void main(String[] args) {
		
		int i =10;                     //primitive data
		Integer i1=Integer.valueOf(i);//non-primitive data or Object
		int i2=i1.intValue();         //primitive
		System.out.println(i2);


		boolean b=true;               //primitive data
		Boolean b1=Boolean.valueOf(b);//non-primitive data or Object
		boolean b2=b1.booleanValue();//primitive
		System.out.println(b2);


		double d=14.20;              //primitive data
		Double d1=Double.valueOf(d);//non-primitive data or Object
		double d2=d1.doubleValue();//primitive
		System.out.println(d2);    


		long l=1245369874575l; //primitive data
		Long l1=Long.valueOf(l);//non-primitive data or Object
		long l2=l1.longValue(); //primitive
		System.out.println(l2);
		
		
		Integer j=20;//second way for unboxing
		int j1=j.intValue();
		System.out.println(j1);
		
		Integer m=new Integer(10);//third way to unboxing
		int m1=m.intValue();
		System.out.println(m1);
		
		
	}	

}
