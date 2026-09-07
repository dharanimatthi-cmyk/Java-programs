/*package CIET;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class class6 {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Chandan","Anil","Rahul","Raj");
		
			List<String> result =names.stream()
					.filter(name -> name.length() > 2)
					.map(String::toUpperCase)
			        .sorted()
					.collect(Collectors.toList());
			        
			        System.out.println(result);
	}

}
*/