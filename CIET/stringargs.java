package CIET;
import java.util.Scanner;
import java.util.Array;

public class stringargs {
	public void main(String[] args) {
		//using string literal
		String s1="hello";
		
		String s2=new String("hello");
		if(s1 == s2) {
			System.out.println("equals");
		}
		else {
			System.out.println("not equal");
		}
	}

}
