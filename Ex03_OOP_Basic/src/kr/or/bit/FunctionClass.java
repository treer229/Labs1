package kr.or.bit;

/*
 함수 : 기능의 최소 단위(method), 4가지 종류가 있다.
	void : 돌려주는 값이 없다.
	return : 8가지 기본타입  
			+ String + 사용자 정의 Class + Array
		    + Collection + Interface
	함수가 return Type(ex.. public int calc() { return 1;}	
	반드시{ 실행블럭 } 안에 return 구문을 가지고 있어야 한다.
	
	parameter :  8가지 기본타입  
			+ String + 사용자 정의 Class + Array
		    + Collection + Interface
	함수(method)는 반드시 호출(call) 되어야 실행 한다 : ...
	     
 1. void , parameter(o)
 2. void , parameter(x)
 3. return Type , parameter(o)
 4. return Type , parameter(x)
 
 */

public class FunctionClass {
	
	public void getChNum() {//이름은 의미 있는 단어의 조합
		System.out.println("void, param(x)");
	}
	public void getChNum2(int i) {
		System.out.println("param value : " + i);
		System.out.println("void, param(o)");
	}
	public int getChNum3() {
		return 100;
		
	}
	public int getChNUm4(int data) {
		return data + 100;
	}
	
	//private 함수
	//class 내부에서 사용
	//공통적 내용을 한곳에 모아서(유지보수에 용의)
	
	private int operationMethod(int data) {
		return data * 100;
	}
	
	public int sum(int data) {
		return operationMethod(data);
	}
	
	public int sum2(int i , int j, int k) {
		return i+j+k; //
	}
	
	//Quiz
	//a와 b 둘중에 큰값을 return 하는 함수
	public int max(int a, int b) {
		return (a>b) ? a:b;
//		(b>c) ? b:c;
//		return result;
	}
	public String concat(String s , String s2 , String s3) {
		return  s+ "/" + s2 + "/" +s3;
	}
	//클래스 == 타입이다
	
	public int call() {
		return 100;
	}
	
	public Tv call() {
		Tv t = new Tv();
		return t;
		
	}
	
	public Tv call() {
		return new Tv();
	}
	
	public void call(Tv t) {
		System.out.println(t.brandName);
	}
	
	public Tv objMethod() {
		Tv tt = new Tv();
		tt.brandName = "SamSung";
		return tt;
	}
	
	public Tv objMethod2() {
		return new Tv();
	}
	
	
	
	
	
	
}
