import kr.or.bit.Tv;

public class TestMain {
	public static void main(String[] args) {
		Person person = new Person("ksj", 26); // 스택 영역에 4byte 빈 공간(Person) null
		person.print();
		Person person2 = new Person("kkk", 140);
		person2.print();
		
		int number = 0; // 메인함수 안에 있는 지역변수
		
		Person you; // 참조타입의 초기화는 주소값을 갖는것이다 이말이야
//		1.참조변수의 초기화 (new 연산자)
//		   you = new Person();
//		2.다른 참조 변수가 가지는 값을 할당 but 같은 타입
		you = person; //person 과 you의 불편한 동거
		System.out.println(you==person);
		
		Tv tv = new Tv();
		tv.brandName = "Three Star";
//		tv.channelNum = 1;
		System.out.println(tv.channelNum);
		System.out.println(tv.brandName);
		
		tv.chUp();
		tv.chUp();
		tv.chUp();
		tv.chUp();
		tv.chUp();
		tv.chUp();
		System.out.println(tv.channelNum);
		
		
		System.out.println("전원정보 : " + tv.power);
		tv.powerOn();
		System.out.println("전원정보 : " + tv.power);

		
	}
}
