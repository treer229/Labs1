package kr.or.bit;

class Person {
	public String name;

	Person(String name) {
		this.name = name;
	}
}

public class Sawon {
	public static void main(String[] args) {
		

	Person[] a1 = {new Person("sun"),
				   new Person("Jo"),
				   new Person("Po")};
	
	for(Person value : a1) {
		System.out.println(value);
	}
	
}
}