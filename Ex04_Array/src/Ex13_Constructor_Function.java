/*
 ������ �Լ�(constructor) : �ʱ�ȭ(member field) �Լ�
 1.Ư���� ������ ������ �Լ�(�ʱ�ȭ)
 2.member feild�� �ʱ�ȭ �Ѵ�..
 
 �Ϲ��Լ��� �ٸ���
 1.�Լ��� �̸��� ����(class �̸��� ����(�ݵ��))
 2.������ �Լ��� return Type�� ���� void�� ���� ���� �پ��� : default void
  why: �������� .... �Լ��� ��ü ������ ���ÿ� ȣ�� ... ���� �ѱ� ���� ����.
  ���� : �����Ǵ� ��ü���� �ٸ� �ʱⰪ�� ������ ������;
  
  ������ �Լ� : overloading �� �����ϴ�.(param�� ������ Ÿ���� �޸��ϸ� �����ϴ���)
 
 ���� : Car c = new Car();
 ���� ��ü ���� > ����ʵ� �ε� > ������ �Լ� ȣ��  > class ������ default
 
 
 
 int [] arr = new int[5];
 
 */

class Gar{
	String name;
	//����� ���� �������ص�
	//�����Ϸ��� �����ڰ� �ִٰ� ����
}

class Car2{
	String name;
	Car2(){//default constructor
		System.out.println("���� ������ �Լ�");
		System.out.println("befor : "+name);
		name = "pony";
		System.out.println("after : "+name);
	}
	
}

class Car3 {
	int number;
	
}

class Car4 {
	int door;
	int wheel;
	
	Car4() {
		
	}
	
	Car4(int num) {
		door = num;
		System.out.println(door);
	}
	Car4(int num, int num2) {
		door = num;
		wheel = num2;
		System.out.println(door);
		System.out.println(wheel);
		Car4 c4 = new Car4();
		Car4 c5 = new Car4(3);
		
	}
}


public class Ex13_Constructor_Function {
	public static void main(String[] args) {
		Car2 c = new Car2();
		
	//1.class ������ ������ �Լ� �������� ������....(default ������ �ڵ� ����)
	//2.class ������ overloading ������ �Լ��� �ϳ��� ����...		
	//3.class ������ default , overloading �Ѵ� ����
		
	}
	class tv{
		String name;
		tv(String n) {
			name = n;
		}
	}
}
