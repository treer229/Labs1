import kr.or.bit.apt;

class Test{
	int i;
	
	void Print() {
		System.out.println("default");
	}
}


/*
 Ŭ���� == ���赵 == Ÿ��
 Ŭ������ �⺻ ������� : field(������, ���°�, ������), �Լ�(���)
 ������(������) : public, private, default(���� �ʴ°�), protected(���)

  1. public class Test{}
  
  2. class Test{} >> default �����ڰ� ����(����)
  default��? ���� ���� �ȿ��� ������ �� �ִ�. �ٸ� ������ ������ ��� �Ұ��ɤ���
  
  3. default class�� ���� ���� ������ �ٸ� Ŭ������ ���� ���� or ���� ����  
 
  4. �ϳ��� �ڹ� ������(a.java) �������� Ŭ������ ���� �� �ִ�.
  	�ڵ� ������......�����δ� ...... �ȵǿ�
 	public Ű�����  Ŭ���� �ϳ��� 
  
  
  default : ���� ���� ������ ����
 */


public class Ex01_main {

	public static void main(String[] args) {
		Person p = new Person();
		//kr.or.bit�� �ִ� Car��� Ŭ������ ���� �ʹ�.
		apt Apt = new apt();
		
}
}