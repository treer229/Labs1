// 클래스는 설계도이다, 클래스는 타입이다
// 클래스 == 설계도 == 타입
// 클래스는 반드시 메모리에 올려야 사용가능 (설계도를 기반으로 땅에 아파트)
// new 통해서 설계도를 기반으로 구체화된 산물(객체)를 만든다

// 설계도 (속성(상태정보) + 행위(기능))
class Apt2{	
	int door;		//객체변수(instance variable) : 초기화X
	int wintdow;	
		
}

public class Ex05_Raf_Type {

	public static void main(String[] args) {
		int i = 100; // i는 100이라는 값을 갖는다
		// Apt2 타입 (사용자 정의 타입 : 여러개의 타입을 모아 넣은 큰 타입)
		Apt2 lg = new Apt2(); // lg라는 변수는 Apt2 객체의 주소값을 갖는다
		// lg = 주소값을 가지고 있는 변수 : 참조변수, 객체변수
		System.out.println("lg 변수의 값은 : 주소 :" + lg);
		
		Apt2 ssapt=lg; //lg가 가지는 주소를 ssapt에게도 전달
		// ssapt녀석과 lg라는 녀석은 같은 집에 ...
		// 참조변수의 할당은 주소값 할당 
		ssapt.wintdow = 50;
		
		System.out.println("창문의 개수는 : " + lg.wintdow);

	}	

}