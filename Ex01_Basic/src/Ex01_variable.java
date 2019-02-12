//main�Լ��� ������ �ִ� Ŭ����
//Tip) c# : public static void Main()
// ���� : variable
// ���� : Scope(��ȿ����) : ����Ǵ� ��ġ�� ���� 
// 1. instance variable : ��ü���� class Test{ private int age;} - ������
// 2. local variable : �������� (�Լ��ȿ� ����� ����)
// class Test{ public void run(){int speed=0;}}
// 3. static variable : �������� (��ü�� ���� �ڿ�)

// ���赵 == class == type(����� ���� Ÿ��, ���� �տ� �� �� �ִ� �ڿ�) ->�ܿ�

// �ϳ��� �ڹ����Ͽ� �������� Ŭ������ ���� �� ������ �������� ����
class Test{
	int iv; //instance variable
	// �� ������ �ʱ�ȭ�� ���� �ʾƵ� �ȴ� (�⺻�� : default) ������ �ִ�.
	// why: int iv=100; �ʱ�ȭ�� ���� �ʾƵ� ��밡���ϰ� �������
	// ��ü���� �ٸ� ����(����Ʈ ���� �ٸ� ������) ���� �ϱ� ���ؼ� 
	
	void print() { //()���� ����
		int i = 100;  
		// �Լ� �ȿ� �ִ� ������ local variable
		//�Լ��� ȣ��Ǹ� �׶� stack�޸𸮿� �����ǰ� �Լ��� ����Ǹ� ���� �Ҹ�
		// *** ���������� �ݵ�� �ʱ�ȭ�Ѵ�(�ϱ�)
		
		// �Լ��ȿ� �ִ� ������ local variable�̶�� �Ѵ� 
		// stack�� ��������� ���� ��������	
		// heap�� ��������� ���� ��ü����
		System.out.println(i);
	}
	
	void write() {
		System.out.println("iv ��������(��ü) :" + iv);
		//System.out.println(i);
		//Error : i ������ Scope : print()�Լ� ����
		int i=200; // ������ �����ؿ�
		// int iv=300;, Error�� �ƴ����� �ǹ̰� �����. ���������� ���������� �򰥸��� ������
	}
	
	
}




public class Ex01_variable { 
	public static void main(String[] args) {
		// ���α׷��� �������� ������ �ִ� Ŭ����
		int s=5; //local variable >> ����� ���ÿ� �ʱ�ȭ
		System.out.println("�������� : s" + s);
		
		int s2; //�����
		s2=100; //�ʱ�ȭ
		System.out.println(s2);
		
	}

}
