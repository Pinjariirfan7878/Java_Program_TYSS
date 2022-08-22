package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class camparable_interface_with_1_variable implements Comparable {
	
	
	int eid;
	
	camparable_interface_with_1_variable(int eid)
	{
		this.eid=eid;
	}

	@Override
	public String toString() {
		return ""+eid+"";
	}
	
	@Override
	public int compareTo(Object o) {
		
		camparable_interface_with_1_variable c=(camparable_interface_with_1_variable)o;
		if(eid<c.eid)
		{
			return -1;
		}
		else if (eid>c.eid)
		{
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		
		camparable_interface_with_1_variable c=new camparable_interface_with_1_variable(10);
		camparable_interface_with_1_variable c1=new camparable_interface_with_1_variable(20);
		camparable_interface_with_1_variable c2=new camparable_interface_with_1_variable(50);
		camparable_interface_with_1_variable c3=new camparable_interface_with_1_variable(40);
		camparable_interface_with_1_variable c4=new camparable_interface_with_1_variable(30);
		camparable_interface_with_1_variable c5=new camparable_interface_with_1_variable(5);
		
		ArrayList a=new ArrayList();
		a.add(c1);
		a.add(c2);
		a.add(c3);
		a.add(c4);
		a.add(c5);
		a.add(c);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
        System.out.println(a);		
	}

	
	


}
