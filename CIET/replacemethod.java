/*package CIET;
import java.util.Scanner;

public class replacemethod {
	public static void main(String[] args) {
		String a="java c python";
		String b=a.replace("java","dart");
		System.out.println(b);
				
	}

}
*/
package CIET;
import java.util.Scanner;

public class replacemethod {
	public static void main(String[] args) {
		String a="java c python";
		boolean b=a.contains("java");
		boolean c=a.startsWith("python");
		System.out.println(b);
		System.out.println(c);
	}
}