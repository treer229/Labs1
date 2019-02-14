package kr.or.bit;
/*
 접근자 modifier
 public : 공유: 폴더(package) 구분없이 모든 자원 공유
 private : (개인 : 클래스 내부에서는 공유자원, 참조변수 사용불가 한 자원)
 			객체지향 특징 : 캡슐화, 은닉화
 1.클래스 내부에서 private int age;
 1.1 private : 직접할당을 막고 간접할당을 통해서 자원 보호
 1.2 설계자의 의도(원하는 값만 처리) age 변수에 1~200 정수만 허용 가능
 1.3 캡슐호ㅑㅏ된 자원의 간접할당을 처리하는 특수한 함수
 	private member field에 read, write를 할 수 있는 함수
 1.4 private int age;
 	-setter (0) 함수
 	-getter (0) 함수
 --필요에 따라서는 하나씩만 구현해도 된다.
 
 */

public class Car {
	private int window;
	private int speed;

	public Car2 s = new Car2();
	
	public void setWindow(int window) {
		this.window = window;
	}

	public int getWindow() {
		return window;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	//필요하다면 추가 함수(기능)
	public void speedUP() {
		speed += 10;
	}
	
	public void SpeedDown() {
		if(speed > 0) {
			speed -= 10;
		}
	}
}
