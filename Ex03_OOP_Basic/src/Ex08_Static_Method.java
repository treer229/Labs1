
public class Ex08_Static_Method {
	int iv = 100;
	
	void method() {
		System.out.println("1");
	}
	static void sMethod() {
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		Ex08_Static_Method ex = new Ex08_Static_Method();
		ex.method();
		Ex08_Static_Method.sMethod();
		
		//���־��� �ڿ��� static���� �����ϴ°� ���ϴٸ�
		//����ƽ�� ���� ������ �׷����ϴ�
		
	}
}
