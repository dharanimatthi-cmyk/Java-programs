package CIET;
class parent {
	int x=10;
}
class Child extends parent{
	void show() {
		System.out.println(x);
	}

}
public class privateinheritance {
	public static void main(String[] args) {
		Child c=new Child();
		c.show();
	}
}
