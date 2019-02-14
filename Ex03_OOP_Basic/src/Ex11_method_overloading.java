/*
 객체 지향 언어 특징
 상속, 캡슐화, 다형성...
 
 캡슐화(은닉화) > private;
 
 [method overloading]
 하나의 이름으로 여러가지 기능을 하는 함수
 하나의 이름으로 여러가지 기능을 하는 함수
 사용 : System.out.println();
 특징 : 오버로딩 성능향상에 도움을 주지 않는다
 	why) 편하게 사용하려고(개발자가) >>
 	설계시 어떤 점을 고려 할까 : 함수의 활용이 많은 경우
 	
 	문법 : 함수의 이름은 같고 parameter 의 개수와 타입을 달리하는 방법
 	1.함수의 이름은 같아야 한다
 	2.[param]의 개수 또는 [type]는 달라야한다/
 	3.return type은 overloading 판단 기준아니다
 	4.parameter 순서 다름을 인정한다
 */
class human {
	String name;
	int age;
}

class OverTest {
	int add(int i) {
		return i + 100;
	}
	String add(int s, int p) {
		return "hellow" + s;
	}
	
//	void add(int k) { //param 충돌 타입과 갯수를 본다.
//	
//}
	int add(int s, int k, int p) {
		return 1;
	}
	
	void add(int i, String s) {
		System.out.println("오버로딩 가능!");
	}
	
	void add(String s, int i) {//린정 린정 씹린정 파라메터 순서가 다름을 쌉인정하는구요
		
	}
	
	void add(human h) {
		h.name = "홍길동";
		h.age = 100;
		System.out.println(h);
	}
		
	}

public class Ex11_method_overloading {

	public static void main(String[] args) {

		OverTest ot = new OverTest();
		System.out.println(ot.add(100));
		
		ot.add("r", 1);
		
		human h = new human();
		ot.add(h);
		System.out.println(h.age);
		System.out.println(h.name);
		
		ot.add(new human());
	}
}
