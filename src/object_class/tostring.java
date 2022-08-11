package object_class;

public class tostring {



	int i;
	String s;

	tostring(int i,String s)
	{
		this.i=i;
		this.s=s;
	}


	@Override
	public String toString() {
		return "tostring [i=" + i + ", s=" + s + "]";
	}


	public static void main(String[] args) {

		//direct printing we will get packageName.className@address
		tostring o=new tostring(10,"irfan");
		System.out.println(o);


	}

}
