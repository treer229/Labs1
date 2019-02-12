class Vtest{
	int iv;
	void print() {
		System.out.println("instance variable : " + iv);
	}
}

class Apt{
	String color; // String은 클래스이지만... 당분간 문자열 타입으로 인정
	
	Apt(String color){ // 함수(특수한 함수) : 함수의 이름이 클래스 이름과 동일
		   // 생성자 함수(constructor) --> 인스턴스 변수를 초기화하는데 사용(String color를 초기화)
		   //color = color; // 지역변수에 지역변수에 넣음
		this.color = color; // this는 Apt(클래스) 가리킴
	}
	void aptPrint() {
		System.out.println("색상 : " + this.color);
	}
}

public class Ex02_variable {

	public static void main(String[] args) {
		Vtest t = new Vtest(); // 타입 다음에는 변수가 온다
		t.print();
		
		Vtest t2 = new Vtest();
		t2.iv= 300;
		t2.print();
		
		Apt sk = new Apt("gold"); // 객체 초기화 --> 생성자 사용

		Apt never = new Apt("red");
		never.aptPrint();
	}
}


