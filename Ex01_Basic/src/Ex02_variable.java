class Vtest{
	int iv;
	void print() {
		System.out.println("instance variable : " + iv);
	}
}

class Apt{
	String color; // String�� Ŭ����������... ��а� ���ڿ� Ÿ������ ����
	
	Apt(String color){ // �Լ�(Ư���� �Լ�) : �Լ��� �̸��� Ŭ���� �̸��� ����
		   // ������ �Լ�(constructor) --> �ν��Ͻ� ������ �ʱ�ȭ�ϴµ� ���(String color�� �ʱ�ȭ)
		   //color = color; // ���������� ���������� ����
		this.color = color; // this�� Apt(Ŭ����) ����Ŵ
	}
	void aptPrint() {
		System.out.println("���� : " + this.color);
	}
}

public class Ex02_variable {

	public static void main(String[] args) {
		Vtest t = new Vtest(); // Ÿ�� �������� ������ �´�
		t.print();
		
		Vtest t2 = new Vtest();
		t2.iv= 300;
		t2.print();
		
		Apt sk = new Apt("gold"); // ��ü �ʱ�ȭ --> ������ ���

		Apt never = new Apt("red");
		never.aptPrint();
	}
}


