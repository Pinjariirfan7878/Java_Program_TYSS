package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class camparable_interface_with_variable2 implements Comparable {
	
	
	int eid;
	String name;
int salary;
	
	camparable_interface_with_variable2(int eid,String name,int salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return  "[eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
	@Override
	public int compareTo(Object o) {
		
		camparable_interface_with_variable2 c=(camparable_interface_with_variable2)o;
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
		
		camparable_interface_with_variable2 c=new camparable_interface_with_variable2(10,"irfan",12500);
		camparable_interface_with_variable2 c1=new camparable_interface_with_variable2(20,"raman",13500);
		camparable_interface_with_variable2 c2=new camparable_interface_with_variable2(50,"manish",14500);
		camparable_interface_with_variable2 c3=new camparable_interface_with_variable2(40,"sai",4500);
		camparable_interface_with_variable2 c4=new camparable_interface_with_variable2(30,"sudheer",10500);
		camparable_interface_with_variable2 c5=new camparable_interface_with_variable2(5,"mani",11500);

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
