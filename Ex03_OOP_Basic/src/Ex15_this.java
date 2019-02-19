/*
 1.객체 자신을 가르키는 this
 
 2.this 객체 자신(생성자 호출) :
 원칙 : 객체 생성시 생성자 함수는 하나만 호출
 예외적으로 this를 사용하면 여러개의 생성자 호출이 가능
 
 */

class Test {
	int i;
	int j;
	Test() {
	}
	Test(int i, int j) {
		this.i = i;
		this.j = j;
	}
	public void print() {
		System.out.println(i+ ", " +j);
	}
}

class SoCar {
	String color;
	String geartype;
	int door;
	
	SoCar() {
		this.color = "red";
	}
	SoCar(String color, String geartype) {
		this.color = color;
		this.geartype = geartype;
	}
}


public class Ex15_this {
	public static void main(String[] args) {
		SoCar so = new SoCar();
		
		SoCar so2 = new SoCar("blue","auto");
		
	}
}
