/*
 1.��ü �ڽ��� ����Ű�� this
 
 2.this ��ü �ڽ�(������ ȣ��) :
 ��Ģ : ��ü ������ ������ �Լ��� �ϳ��� ȣ��
 ���������� this�� ����ϸ� �������� ������ ȣ���� ����
 
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
