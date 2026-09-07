package CIET;
class Animal{
	void sound() {
		System.out.println("animal makes sound");
	}
}
class Dog extends Animal {
	void sound() {
		System.out.println("dog barks");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("cat meows");
	}
}
public class Runtime {
	public static void main(String[] args) {
		Animal a=new Dog();
		Animal c=new Cat();
		d.sound();
		c.sound();
				
	}

}
