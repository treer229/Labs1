//������ (Ex04_Variable_Scope.java ���� �ȿ���)

class Variable{
	int iv;
	/*
	 1. member field, instance varible
	 2. ����? ������ ����(����, ����, ����(��ǰ))
	 3. Ư¡? �ʱⰪ�� ������ �ִ� ���̴��̸��̾�
	 		�ʱ�ȭ�� ���� �ʴ´�.(�����Ǵ� ��ü���� �ٸ� ���� ���´�)
	 4. ��������(memory�� �ε��Ǵ� ����) : new��� ������
	 */
	static int cv;
	/*
	 1.Ư¡ : ��ü�� ��������� �ʾƵ� ���� ����(Math.random();)
	 2.���� : ���ٹ�� >> Ŭ�����̸�.static�ڿ�
	 3.�������� : ���α׷��� ����(java hellow) class loader system�� ���ؼ� Ŭ���� ������ �а� (class area)
	 		   >>static ��ü ���� ������ memory �ö󰡴� �ڿ�
	 */
}



public class Ex04_Variavle_Scope {
	public static void main(String[] args) {
		/*
		Variable.cv = 100; //static ����(����)
		
		Variable v = new Variable(); 
		v.iv = 200;
		v.cv = 303;
		*/
		System.out.println(Variable.cv);
		
		Variable v = new Variable();
		System.out.println(v.cv);

		Variable v2 = new Variable();
		System.out.println(v2.cv);
	}
}
