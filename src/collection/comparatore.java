package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparatore  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

		String s1=(String)o1;
		String s2=(String)o2;

		if(s1.compareTo(s2)>0)
		{
			return 1;
		}
		if(s1.compareTo(s2)<0)
		{
			return -1;
		}
		return 0;
	}


	public static void main(String[] args) {

		ArrayList<String> le=new ArrayList();
		le.add("java");
		le.add("selenium");
		le.add("manual");
		le.add("SQL");
		System.out.println(le);
		Collections.sort(le,new comparatore());
		System.out.println(le);



	}


}
