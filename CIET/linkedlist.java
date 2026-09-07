package CIET;
import java.util.*;
import java.util.ArrayList;
public class linkedlist {
	public static void main(String[] args) {
	LinkedList<String> lt=new LinkedList<>();
	lt.add("rani");
	lt.add("ram");
	lt.add("mahi");
	lt.add("harsh");
	lt.add("buddi");
	System.out.println(lt);
	lt.addFirst("ram");
	lt.addLast("shiva");
	System.out.println(lt);
	lt.removeFirst();
	lt.removeLast();
	System.out.println(lt);
	}
}
