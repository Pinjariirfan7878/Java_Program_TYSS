package collection;

import java.util.ArrayList;
import java.util.Collections;

public class collections_class {
	
public static void main(String[] args) {
		
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(5);
		a.add(11);
		a.add(10);
		a.add(9);
		a.add(45);
		
		System.out.println(a);
	//for sorting list	
		Collections.sort(a);
		System.out.println(a);
	//for sorting list	
		Collections.reverse(a);
		System.out.println(a);

     }
}