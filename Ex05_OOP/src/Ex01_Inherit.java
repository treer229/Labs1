/*
 1.상속
 java : Child extends base
 c# : Child : Base
 
 2.상속특징
 -다중상속은 불가
 -단일상속이 원칙(계층적 상속을 사용해서 다중상속을 구현)

 3.의미
 진정한 의미 : [재사용성]을 살리겠다 >> 공통코드는 부모가 가지고 있다.
 단점 : 초기 설계 비용....
 
 재사용성 >> 설계시 >> 비용(시간, 공통분모, 추상화)
 */

class GrandFather {
	public int money = 5000;
	private int mymo = 5999;
	//참조변수도 접근 불가
	//상속관계 접근 불가
	
}

class Father extends GrandFather {
	public int money2 = 3000;
}

class Son extends Father {
	public int money3 = 100;
}
public class Ex01_Inherit {
	public static void main(String[] args) {
		Son s = new Son();
		
	}
}
