/*
 ��ü ���� ��� Ư¡
 ���, ĸ��ȭ, ������...
 
 ĸ��ȭ(����ȭ) > private;
 
 [method overloading]
 �ϳ��� �̸����� �������� ����� �ϴ� �Լ�
 �ϳ��� �̸����� �������� ����� �ϴ� �Լ�
 ��� : System.out.println();
 Ư¡ : �����ε� ������� ������ ���� �ʴ´�
 	why) ���ϰ� ����Ϸ���(�����ڰ�) >>
 	����� � ���� ��� �ұ� : �Լ��� Ȱ���� ���� ���
 	
 	���� : �Լ��� �̸��� ���� parameter �� ������ Ÿ���� �޸��ϴ� ���
 	1.�Լ��� �̸��� ���ƾ� �Ѵ�
 	2.[param]�� ���� �Ǵ� [type]�� �޶���Ѵ�/
 	3.return type�� overloading �Ǵ� ���ؾƴϴ�
 	4.parameter ���� �ٸ��� �����Ѵ�
 */
class human {
	String name;
	int age;
}

class OverTest {
	int add(int i) {
		return i + 100;
	}
	String add(int s, int p) {
		return "hellow" + s;
	}
	
//	void add(int k) { //param �浹 Ÿ�԰� ������ ����.
//	
//}
	int add(int s, int k, int p) {
		return 1;
	}
	
	void add(int i, String s) {
		System.out.println("�����ε� ����!");
	}
	
	void add(String s, int i) {//���� ���� �ø��� �Ķ���� ������ �ٸ��� �������ϴ±���
		
	}
	
	void add(human h) {
		h.name = "ȫ�浿";
		h.age = 100;
		System.out.println(h);
	}
		
	}

public class Ex11_method_overloading {

	public static void main(String[] args) {

		OverTest ot = new OverTest();
		System.out.println(ot.add(100));
		
		ot.add("r", 1);
		
		human h = new human();
		ot.add(h);
		System.out.println(h.age);
		System.out.println(h.name);
		
		ot.add(new human());
	}
}
