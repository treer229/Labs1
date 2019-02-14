package kr.or.bit;

public class InitTest {
	public static int cv = 1; //static 변수 or class변수
	public int iv = 1;
//	public void st() {
//		static int d = 1;
//		return d;
//	}
//	
	static { cv = 2;} //static 초기화 블럭, class 초기화 블럭
	{iv =2;} //인스턴스 초기화 블럭
	
	public InitTest() {//생성자 함수(초기화 : instance variable)
		cv = 3;
	}
}
