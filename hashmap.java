package CIET;
import java.util.*;
import java.io.*;
public class hashmap {
	public static void main(String[] args) {
		HashMap<Integer,String> scanner=new HashMap<>();
		scanner.put(101,"john");
		scanner.put(103, null);
		scanner.put(null,"david");
		scanner.put(102,"smith");
		System.out.println(scanner);
		System.out.println(scanner.get(101));
		System.out.println(scanner.containsKey(101));
		System.out.println(scanner.containsValue("john"));
	}

}
