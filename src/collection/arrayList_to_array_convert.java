package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList_to_array_convert {
	
public static void main(String[] args) {
		
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(5);
		a.add(11);
		a.add(10);
		a.add(9);
		a.add(45);
		
		
		System.out.println(a);
		
		//convertion of ArrayList to array (arrayList should be generic)
		
		Object[] arr = a.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		ArrayList<String> b=new ArrayList<String>();
		b.add("manual");
		b.add("15");
		b.add("java");
		b.add("9");
		b.add("selenium");
		
		System.out.println("\n"+b);
		
		Object[] arr2 = b.toArray();
		System.out.println(Arrays.toString(arr2));
	

 }
}
