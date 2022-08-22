package LinkedList;

import java.util.LinkedList;

public class Linked_List {
	
	public static void main(String[] args) {
		
		
		LinkedList l=new LinkedList();
		l.add("I");
		l.add("R");
		l.add("F");
		l.add("A");
		l.add("N");
		
		System.out.println(l);
		l.addFirst("P");
		l.addLast("O");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.add(null);
		System.out.println(l);
	}

}
