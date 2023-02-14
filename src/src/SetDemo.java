package src;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		
		s.add(5);
		s.add(5);
		s.add(10);
		s.add(4);
		s.add(69);
		s.add(420);
		s.add(1);
		
		System.out.println("Size of the set: "+s.size());
		System.out.println("All elements: "+s);
		
		System.out.println("First element: "+s.first());
		System.out.println("Last element: "+s.last());
		System.out.println("headset: "+s.headSet(5));
		System.out.println("tailset: "+s.tailSet(69));
		System.out.println("subset:" +s.subSet(10, 69));
	}
}
