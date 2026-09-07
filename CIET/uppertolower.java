package CIET;
import java.util.Scanner;

public class uppertolower {
	public static void main(string[] args) {
		Scanner sc=new Scanner(System.in);
		String result="";
		for(int i=0;i<str.length(); ++) {
			char ch=str.charAt(i);
			if(ch>='a'&& ch<'z') {
				ch=(char)(ch-32);
			}
			result=result+ch;
		}
		System.out.println(result);
		sc.close();
	}
}