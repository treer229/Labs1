
class Zcar {
	public String name;
	public int num;
	
	
	Zcar() {
		this("sj", 1); // �ڱ��ڽ��� ȣ��(������ �Լ� ȣ�� ����)
	}
	Zcar(String name, int num) {
		this.name = name;
		this.num = num;
	}
}

class Zcar2 {
	public String color;
	public boolean sunloop;
	public int door;
	
	
	Zcar2() {
		this("red", false);
	}
	
	Zcar2(String color, boolean sunloop) { //������ ����� ���� ���� ���ð���
		this(color, sunloop, 4);
	}
	
	Zcar2(String color, boolean sunloop, int door) { //������ ����, ���, �� ����
		this.color = color;
		this.sunloop = sunloop;
		this.door = door;
	}
}

public class Ex16_Constructor_Call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
