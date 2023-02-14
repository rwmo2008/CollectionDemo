package src;
import java.util.*;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String, Integer> grades = new HashMap<>();
		
		grades.put("Economics", 80);
		grades.put("History", 90);
		
		System.out.println("All entries: "+ grades);
		
		System.out.println("Select with key: " + grades.get("History"));
		System.out.println("Keys only: "+grades.keySet());
		System.out.println("Values only: "+grades.values());
		System.out.println("All entries: "+grades.entrySet());
		System.out.println("Contains key: "+grades.containsKey("History"));
		
		//grades.remove("Economics");
		//System.out.println("After remove: "+grades);
	}
}
