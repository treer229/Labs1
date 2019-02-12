package kr.or.bit;

/*
 �Լ� : ����� �ּ� ����(method), 4���� ������ �ִ�.
	void : �����ִ� ���� ����.
	return : 8���� �⺻Ÿ��  
			+ String + ����� ���� Class + Array
		    + Collection + Interface
	�Լ��� return Type(ex.. public int calc() { return 1;}	
	�ݵ��{ ����� } �ȿ� return ������ ������ �־�� �Ѵ�.
	
	parameter :  8���� �⺻Ÿ��  
			+ String + ����� ���� Class + Array
		    + Collection + Interface
	�Լ�(method)�� �ݵ�� ȣ��(call) �Ǿ�� ���� �Ѵ� : ...
	     
 1. void , parameter(o)
 2. void , parameter(x)
 3. return Type , parameter(o)
 4. return Type , parameter(x)
 
 */

public class FunctionClass {
	
	public void getChNum() {//�̸��� �ǹ� �ִ� �ܾ��� ����
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
	
	//private �Լ�
	//class ���ο��� ���
	//������ ������ �Ѱ��� ��Ƽ�(���������� ����)
	
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
	//a�� b ���߿� ū���� return �ϴ� �Լ�
	public int max(int a, int b) {
		return (a>b) ? a:b;
//		(b>c) ? b:c;
//		return result;
	}
	public String concat(String s , String s2 , String s3) {
		return  s+ "/" + s2 + "/" +s3;
	}
	//Ŭ���� == Ÿ���̴�
	
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
