import kr.or.bit.Airplane;

/*
  ����� �����ϴ� ���赵(class)�� �ۼ��Ϸ��� �մϴ�
�䱸����  
 1. ����� �̸��� ��ȣ�� �ο�
 2. ����Ⱑ ����Ǹ� �̸��� ��ȣ�� �°� �ο��Ǿ����� Ȯ�� (���� ���)
 3. ����Ⱑ ��� �ɶ����� ������� ��������� Ȯ���� �� �ֽ��ϴ� count++
 4. ���ݱ��� ��� �ڵ常 ����ϼ���
 
 */


public class Ex06_Static_airplane {
	public static void main(String[] args) {
		
		Airplane a1 = new Airplane(1, "sj");
		a1.airCheck();
		System.out.println(a1.sellCheck());
		
		Airplane a2 = new Airplane(2, "sj");
		a2.airCheck();
		System.out.println(a2.sellCheck());
		
		Airplane a3 = new Airplane(3, "sj");
		a3.airCheck();
		System.out.println(a3.sellCheck());
		
	}
}
