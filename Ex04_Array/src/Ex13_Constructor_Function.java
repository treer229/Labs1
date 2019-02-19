/*
 생성자 함수(constructor) : 초기화(member field) 함수
 1.특수한 목적을 가지는 함수(초기화)
 2.member feild를 초기화 한다..
 
 일반함수와 다른점
 1.함수의 이름이 고정(class 이름과 동일(반드시))
 2.생성자 함수는 return Type도 없고 void도 없고 없엉 다없엉 : default void
  why: 생성시점 .... 함수는 객체 생성과 동시에 호출 ... 값을 넘길 곳이 없다.
  목적 : 생성되는 객체마다 다른 초기값을 가지고 싶을때;
  
  생성자 함수 : overloading 이 가능하다.(param의 갯수와 타입을 달리하면 가능하다잉)
 
 시점 : Car c = new Car();
 힙에 객체 생성 > 멤버필드 로딩 > 생성자 함수 호출  > class 생성시 default
 
 
 
 int [] arr = new int[5];
 
 */

class Gar{
	String name;
	//당신이 직접 구현안해도
	//컴파일러는 생성자가 있다고 가정
}

class Car2{
	String name;
	Car2(){//default constructor
		System.out.println("나는 생성자 함수");
		System.out.println("befor : "+name);
		name = "pony";
		System.out.println("after : "+name);
	}
	
}

class Car3 {
	int number;
	
}

class Car4 {
	int door;
	int wheel;
	
	Car4() {
		
	}
	
	Car4(int num) {
		door = num;
		System.out.println(door);
	}
	Car4(int num, int num2) {
		door = num;
		wheel = num2;
		System.out.println(door);
		System.out.println(wheel);
		Car4 c4 = new Car4();
		Car4 c5 = new Car4(3);
		
	}
}


public class Ex13_Constructor_Function {
	public static void main(String[] args) {
		Car2 c = new Car2();
		
	//1.class 생성시 생성자 함수 구현하지 않으면....(default 생성자 자동 생성)
	//2.class 생성시 overloading 생성자 함수를 하나라도 구현...		
	//3.class 생성시 default , overloading 둘다 구현
		
	}
	class tv{
		String name;
		tv(String n) {
			name = n;
		}
	}
}
