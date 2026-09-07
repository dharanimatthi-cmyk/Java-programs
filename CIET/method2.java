/*package CIET;
import java.util.Scanner;
public class method2 {
	public static void print() {
		System.out.println("guntur");
	}
	public static void main(String[] args) {
		print();
	}

}
*/
package CIET;
import java.util.Scanner;
public class method2 {
	void god(String name) {
		System.out.println("name :"+ name);
	}
	public static void main(String[] args) {
		method m=new method();
		m.god("shiva");
		m.god("hanuman");
		m.god("narasimha");
		m.god("vishmu");
	}
}

