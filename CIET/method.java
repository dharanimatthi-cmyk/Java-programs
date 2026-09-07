package CIET;
import java.util.Scanner;
public class method {
	int dog(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		method m=new method();
		int a=m.dog(10,20);
		System.out.println(a);
	}
}