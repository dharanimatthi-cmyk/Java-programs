package CIET;
class Parent {
	void display() {
		System.out.println("inside parent");
	}

}
class Child extends Parent{
	void display() {
		System.out.println("inside child class");
		super.display();
	}
}



public class superkey {
	public static void main(String[] args) {
		Child c=new Child();
		c.display();
	}
}
