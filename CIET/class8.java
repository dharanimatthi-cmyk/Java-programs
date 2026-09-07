/*package CIET;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class class8 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Dharani", "Charan", "Sowmya", "Madhu");
		
		List<String> result = names.stream()
				.filter(name -> name.startsWith("D"))
				.map(String::toUpperCase)
		        .sorted()
				.collect(Collectors.toList());
		
        System.out.println(result);

	}

}
*/