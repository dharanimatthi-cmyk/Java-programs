/*
package CIET;

public class Cse {
	public static void main(String args[]) {
		System.out.println("Hello!");
	}
}



// local variable example


package CIET;

public class Cse {
	public static void main(String args[]) {
		int age=19;
		String name="Anu Sri";
		System.out.println("Age :"+age);
		System.out.println("Name :"+name);
	}
}
 

//Global (or) Inatace Variable example

package CIET;

public class Cse {
	String name;
	int age;
	public static void main(String args[]) {
		Cse a=new Cse();
		a.name="Anu";
		a.age=19;
		System.out.println("Name :"+ a.name);
		System.out.println("Age :"+ a.age);
	}
}



//default values for global variables there is no default value for local variables

package CIET;

public class Cse {
	byte b;
	short c;
	int d;
	long e;
	float f;
	double g;
	char ch;
	String s;
	public static void main(String args[]) {
		Cse a=new Cse(); 
		System.out.println("Byte:"+a.b);
		System.out.println("Short:"+a.c);
		System.out.println("Int:"+a.d);
		System.out.println("Long:"+a.e);
		System.out.println("Float:"+a.f);
		System.out.println("Double:"+a.g);
		System.out.println("String:"+a.ch);
		System.out.println("String:"+a.s);
	}
}


//static keyword example

package CIET;

public class Cse {
	static String college="CIET Guntur";
	String name;
	int age;
	public static void main(String args[]) {
		Cse student1=new Cse();
		Cse student2=new Cse();
		student1.name="Sunitha";
		student1.age=20;
		student2.name="Manisha";
		student2.age=19;
		System.out.println("Student1 Name:"+student1.name);
		System.out.println("Student1 Age:"+student1.age);
		System.out.println("Student1 College Name:"+student1.college);
		System.out.println("Student2 Name:"+student2.name);
		System.out.println("Student2 Age:"+student2.age);
		System.out.println("Student2 College Name:"+student2.college);
	}
}

//arithmetic operator

package CIET;

public class Cse {
	public static void main(String args[]) {
		byte a=15;
		byte b=2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
}


//relational operator

== equal to
!= not equal
>greater than
<lessthan 
>=greater than or equal to
<=lessthan or equal to


package CIET;

public class Cse {
	public static void main(String args[]) {
		byte a=23;
		byte b=15;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
	}
}

*/

//Assignment operator
/*package CIET;

public class Cse {
	public static void main(String args[]) {
		byte a=15;
		byte b=2;
		System.out.println(a=b);
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
	}
/*package CIET;
public class Cse{
    public static void main(String args[]) {
    	int a=10;
    	System.out.println(++a);
    	System.out.println(a++);
    	System.out.println(a);
    }
 }
*/
/*package CIET;

import java.util.Scanner;

public class Cse{
	public static void main(String args[]) {
		Scanner z=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=z.nextInt();
		System.out.println("enter the 2nd number");
		int b=z.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
		System.out.println("after swap :" +a);
		System.out.println("after swapping:" +b);
	}
}
*/
/*package CIET;

import java.util.Scanner;

 public class Cse{
	 public static void main(String args[]) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter a number");
	 int a=s.nextInt();
	 if(a%2==0) {
		System.out.println("even");
		
	}
	else {
		System.out.println("odd");
    }
  }
}
*/
/*package CIET;

import java.util.scanner;

 public class Cse{
	 public static void main(String args[]) {
		 java.util.Scanner s=new Scanner(System.in);
		 System.out.println("enter a marks ");
		 int marks =s.nextInt();
		 if(marks>70);
		   System.out.println("Garde A");
	 }
	 else(if marks>=80){
	    System.out.println("Garde B");
     }
     else(if marks>=90){
         System.out.println("Garde C");
     }
     else {
    	 System.out.println("Fail");
         
	 }
	 
 }
*/
/*package CIET;
import java.util.Scanner;

 public class Cse{
	 public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a day");
		int day=s.nextInt();
		    switch(day) {
		    case 1:
		      System.out.println("Monday");
		      break;
		    case 2:
		    	System.out.println("Tuesday");
		    	break;
		    	
		   }
	  }
}
*/
/*package CIET;
import java.util.Scanner;

   public class Cse{
	   public static void main(String args[]) {
	   for(;;) {
	   	   System.out.println("Dharani");
   }
	   
   }
   }
*/
/*package CIET;
 import java.util.Scanner;
 
   public static void main(String args[]) {
	   for(int i=1;i<=5;i++) {
		   System.out.println("Dharani");
   }
	   
   
   }
*/
/*package CIET;
import java.util.scanner;

    public class Cse{
        public static void main(String args[]) {
        	Scannner sc=new Scanner(System.in);
        	int n=sc.nextInt();
        	int a=0;
        	int b=1;
        	System.out.println("fibonacci series");
        	for(int i=1;i<=n;i++);
        	    System.out.println(a + " ");
        	    int c=a+b;
        	    a=b;
        	    b=c;
    }
    
    }
    */
/* package CIET;
 import java.util.scanner;
    
    public class Cse{
    	public static void main(String args[]) {
    	
    		
    	}
    }
        
    //Declaration + allocation
    //int[] a=new int[5];
    //initialization
    //int[] a={10,20,30,40,};
*/
/*package CIET;
 import java.util.scanner;
  
   public class Cse{
	   public static void main(String args[]) {
		   int[] a=new int[5];
		   System.out.println(a.length);
	   }
   }
*/
/* package CIET;
 import java.util.Scanner;

  public class CSE{
	  public static void main(String args[]) {
		  int[] a=new int[5];
		  a[0]=10;
		  a[1]=20;
		  a[2]=30;
		  a[3]=40;
		  a[4]=50;
		  a[5]=60;
		  System.out.println(a[0]);
		  System.out.println(a[6]);
   }
*/
