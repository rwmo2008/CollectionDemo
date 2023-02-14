package src;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.add(420);
		l.add("Nope");
		l.add(null);
		System.out.println(l);
		
		LinkedList ll = new LinkedList(l);
		System.out.println(ll);
		
		l.set(0, 24);
		l.removeLast();
		System.out.println(l);
		
		l.addFirst("ONE");
		System.out.println(l);
	}

}
