package CIET;
import java.util.Scanner;
import java.util.Arrays;

public class jaggedarray {
	public static void main(string[]args) {
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][];
		a[0]=new int[2];
		a[1]=new int[3];
		a[2]=new int[4];
		for(int i=0; i<a.length;i++) {
			for(int j=o; j<a[i].length;j++) {
				a[i][j]=sc.nextint();
			}
			for(int i=0;i<a.length;++) {
				for(int j=0;j<a[i].length;j++) {
					System.out.print(a[i][j]+"");
				}
				System.out.println();
			}
		}
	}

}
