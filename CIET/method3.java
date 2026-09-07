package CIET;
import java.util.Scanner;

public class method3 {
	double ciet(int a,int b,double c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		method m=new method();
		double a=m.ciet(12,34,99,9);
		System.out.println(a);
	}

}

/*package CIET;
import java.util.Scanner;

class method3 {
	static int human() {
		int a=20;
		int b=30;
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		int a=human();
		System.out.println(a);
	}
}
*/
