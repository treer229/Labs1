// Ŭ������ ���赵�̴�, Ŭ������ Ÿ���̴�
// Ŭ���� == ���赵 == Ÿ��
// Ŭ������ �ݵ�� �޸𸮿� �÷��� ��밡�� (���赵�� ������� ���� ����Ʈ)
// new ���ؼ� ���赵�� ������� ��üȭ�� �깰(��ü)�� �����

// ���赵 (�Ӽ�(��������) + ����(���))
class Apt2{	
	int door;		//��ü����(instance variable) : �ʱ�ȭX
	int wintdow;	
		
}

public class Ex05_Raf_Type {

	public static void main(String[] args) {
		int i = 100; // i�� 100�̶�� ���� ���´�
		// Apt2 Ÿ�� (����� ���� Ÿ�� : �������� Ÿ���� ��� ���� ū Ÿ��)
		Apt2 lg = new Apt2(); // lg��� ������ Apt2 ��ü�� �ּҰ��� ���´�
		// lg = �ּҰ��� ������ �ִ� ���� : ��������, ��ü����
		System.out.println("lg ������ ���� : �ּ� :" + lg);
		
		Apt2 ssapt=lg; //lg�� ������ �ּҸ� ssapt���Ե� ����
		// ssapt�༮�� lg��� �༮�� ���� ���� ...
		// ���������� �Ҵ��� �ּҰ� �Ҵ� 
		ssapt.wintdow = 50;
		
		System.out.println("â���� ������ : " + lg.wintdow);

	}	

}