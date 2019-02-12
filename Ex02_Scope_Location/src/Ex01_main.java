import kr.or.bit.apt;

class Test{
	int i;
	
	void Print() {
		System.out.println("default");
	}
}


/*
 클래스 == 설계도 == 타입
 클래스의 기본 구성요소 : field(고유값, 상태값, 참조값), 함수(기능)
 접근자(한정자) : public, private, default(쓰지 않는것), protected(상속)

  1. public class Test{}
  
  2. class Test{} >> default 접근자가 사용됨(생략)
  default란? 같은 폴더 안에서 공유할 수 있다. 다른 폴더에 있으면 사용 불가능ㅇㅇ
  
  3. default class는 같은 폴더 내에서 다른 클래스의 참조 목적 or 연습 목적  
 
  4. 하나의 자바 파일은(a.java) 여러개의 클래스를 가질 수 있다.
  	코딩 연습용......실제로는 ...... 안되여
 	public 키워드는  클래스 하나만 
  
  
  default : 같은 폴더 내에서 사용시
 */


public class Ex01_main {

	public static void main(String[] args) {
		Person p = new Person();
		//kr.or.bit에 있는 Car라는 클래스를 쓰고 싶다.
		apt Apt = new apt();
		
}
}