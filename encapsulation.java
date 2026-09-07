package CIET;
class student{
	private String name;
	private int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
}
public class encapsulation {
	public static void main(String[] args) {
		Student s=new Student("Dharani",21);
		System.out.println(s.getName());
		System.out.println(s.getAge());
	}

}
