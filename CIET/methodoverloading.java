package CIET;
import java.util.Scanner;

public class methodoverloading {
	void add(int a) {
		System.out.println(a);
	}
	void add(double a) {
		System.out.println(a);
	}
	void add(int b,double c) {
		System.out.println(b+c);
	}
	public static void main(String[] args) {
		methodoverloading m=new methodoverloading();
		m.add(12);
		m.add(12.5);
		m.add(12.13);
	}

}
