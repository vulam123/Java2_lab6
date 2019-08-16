package ex3_4_5;

import java.util.ArrayList;

public class PersonModel<T> {
	public ArrayList<T> list = new ArrayList<T>();
	public void addObject(T object) {
		list.add(object);
	}
	public void display() {
		for(T e: list) {
			System.out.println(e);
		}
	}
	public static void main(String [] args) {
		PersonModel<Student> p1 = new PersonModel<Student>();
		p1.addObject(new Student("1", "xxx", 18));
		p1.addObject(new Student("2", "ddd", 19));
		p1.display();
		PersonModel<employee> p2 = new PersonModel<employee>();
		p2.addObject(new employee("1", "xxx", 1800));
		p2.addObject(new employee("2", "ddd", 1009));
		p2.display();
	}
}
