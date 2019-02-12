//main함수를 가지고 있는 클래스
//Tip) c# : public static void Main()
// 변수 : variable
// 변수 : Scope(유효범위) : 선언되는 위치에 따라서 
// 1. instance variable : 객체변수 class Test{ private int age;} - 전국구
// 2. local variable : 지역변수 (함수안에 선언된 변수)
// class Test{ public void run(){int speed=0;}}
// 3. static variable : 공유변수 (객체간 공유 자원)

// 설계도 == class == type(사용자 정의 타입, 변수 앞에 쓸 수 있는 자원) ->외워

// 하나의 자바파일에 여러개의 클래스를 만들 수 있으나 권장하지 않음
class Test{
	int iv; //instance variable
	// 이 변수는 초기화를 하지 않아도 된다 (기본값 : default) 가지고 있다.
	// why: int iv=100; 초기화를 하지 않아도 사용가능하게 했을까요
	// 객체마다 다른 값을(아파트 마다 다른 층수를) 갖게 하기 위해서 
	
	void print() { //()동전 구멍
		int i = 100;  
		// 함수 안에 있는 변수를 local variable
		//함수가 호출되면 그때 stack메모리에 생성되고 함수가 종료되면 같이 소멸
		// *** 지역변수는 반드시 초기화한다(암기)
		
		// 함수안에 있는 변수를 local variable이라고 한다 
		// stack에 만들어지는 것이 지역변수	
		// heap에 만들어지는 것이 객체변수
		System.out.println(i);
	}
	
	void write() {
		System.out.println("iv 전역변수(객체) :" + iv);
		//System.out.println(i);
		//Error : i 변수의 Scope : print()함수 내부
		int i=200; // 언제라도 가능해요
		// int iv=300;, Error는 아니지만 의미가 없어요. 전역변수와 지역변수가 헷갈리기 때문에
	}
	
	
}




public class Ex01_variable { 
	public static void main(String[] args) {
		// 프로그램의 시작점을 가지고 있는 클래스
		int s=5; //local variable >> 선언과 동시에 초기화
		System.out.println("지역변수 : s" + s);
		
		int s2; //선언부
		s2=100; //초기화
		System.out.println(s2);
		
	}

}
