
class StaticClass {
	int iv;
	static int cv;

	void m() {
		// �Ϲ��Լ�m() iv���� ó�� (0);
		// �Ϲ��Լ� m() cv���� ó��(0);
		System.out.println("iv: " + iv + " , " + "cv: " + cv);
	}
	
	static void sm() {
		//�Ϲ� �ڿ��� iv�ڿ��� ����� �� �ִ�?(X)
		cv = 100;
		//�������� ��ƶ� �׷��� error�� ���� ���̴�.
		//static�� static���� ��ƶ�	
	}
	/*
	 �Ϲ��Լ� : �Ϲ��ڿ�, static �ڿ� ��� ���
	 ����ƽ�Լ� : static �ڿ��� ��� ����
	 
	 */
}

public class Ex07_static_method {
	public static void main(String[] args) {
//		StaticClass s = new StaticClass();
		StaticClass.sm(); //����~
		
		
	}
}
