package src;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("Nope");
		al.add(true);
		al.add(42);
		al.add("00D2");
		al.add("Collection");
		
		System.out.println("Initial List: "+ al);
		System.out.println("Size of list: " +al.size());
		
		al.remove("00D2");
		System.out.println("Initial List: "+ al);
		al.remove(1);
		System.out.println("Initial List: "+ al);
	}
}
