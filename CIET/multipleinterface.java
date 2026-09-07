package CIET;

interface Animal{
	void eat();
}
interface Dog{
	void barks();
}
class Cat implements Animal,Dog{
	public void eat() {
		System.out.println("animal eats");
	}
	public void barks() {
		System.out.println("dog barks");
	}
}
public class multipleinterface {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.eat();
		c.barks();
	}

}
