package CIET;
interface Calculator{
	static int square(int n) {
		return n*n;
	}
}
public class Strings {
	public static void main(String[] args) {
		int d=Calculator.square(5);
		System.out.println(d);
	}

}
