package home;

public class nnn {
	public static void main(String[] args) {
		
	
	String s="my name is irfan";

	String s1[]=s.split(" ");



	for(int i=0;i<s1.length;i++)
	{
	    String value=s1[i];
	    String v1=value.substring(0,1).toUpperCase();
	
	    String v2=value.substring(1);

	    value=v1+v2;
	    System.out.print(value+" ");

	}

  }

}
