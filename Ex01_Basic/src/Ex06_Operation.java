
public class Ex06_Operation {

	public static void main(String[] args) {
		int result =100/100;
		System.out.println(result);
		
		result = 13/2;
		System.out.println(result);
		
		result = 13%2;
		System.out.println(result); //������ ���ϱ�
		
		// ������ ������ (++, --) 1�� �����ϰų�, 1�� ����
		int i = 10;
		++i; // ��ġ����
		System.out.println(i);
		i++; // ��ġ����
		System.out.println(i);
		//���� 1�� : ��ġ, ��ġ ����
		
		// POINT : ��ġ�� ��ġ�� �����ڿ� �����ϸ� ������ �巯��
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2; //j2�� 1������Ű�� + ����
		System.out.println(result2);
		//i2>5, j2>5, result > 10
		result2 = i2 + j2++;
		System.out.println();
		//i2>5, j2>6, result > 10
		System.out.println(j2);
		
		byte b = 100; //-128~127
		byte c = 1;
		byte d = (byte)(b+c); // �ϴ� 101 ���ڰ� 1byte ǥ��...
		//1. byte d = (byte)(b + c); �����Ⱚ�� �߻� ����
		//2. int d = b+c; ����
		System.out.println("d : " + d);
		
		float num2 = 10.45f;
		int num3 = 20;
		// num2 + num3 
		
		// char�� ���� Ÿ��
		char c2 = '!';
		char c3 = '!';
		int result6 = c2 +c3; //!!(x)
		// char result6 = c2+c3; int = int + int
		System.out.println(result6);
		System.out.println((char)result6);
		
		// ���
		// �߼ұ�� ���蹮�� (������ ����) => �����
		int sum = 0;
		for(int j=1; j<=100; j++) {
			if(j%2==0) {
				sum += j;
				}
		}
		System.out.println("sum :" + sum);
		
		//==������
		//���� ���Ѵ� (Ÿ��X 2������ X) �񱳿����ڴ� ��� �۵��Ѵ� �ų�?
		if(10 == 10.0f) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		//! ����������
		if('A'!=65) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	
		//�ϱ�����
		//���ó�� ���� ������(���� ������)
		int p = 10;
		int k = -10;
		int result0 = (p==k)? p:k;
		// ?�տ� �ִ� ���ǽ� true ���  : �տ� �ִ� ����
		// ?�տ��ִ� ���ǽ��� false��� : �ڿ� �ִ� ����
		System.out.println(result0);
		
		if(p==k) {
			int result00 = p;
		}else {
			int result00 = k;
		}
		//3�׿����ڰ� �ξ� ���ϴ�
		
		//������ |, &
		// 0�� 1�� bit ����
		int x = 3;
		int y = 5;
		System.out.println("x|y : " + (x|y));
		//����ǥ
		// 0: false
		// 1: true
		
		/*
		 *or
		0 0 false0 
		0 1 true1
		1 0 true1
		1 1 ture1
		
		and
		0 0 
		0 1
		1 0
		1 1
		
		sql(oracle)
		select * 
		from emp
		where job='salse' and sal > 2000;
		
		select * 
		from emp
		where job='salse' or sal > 2000;
		
		*/
		
		//Point������ (||(or), &&(and))  => return boolean
		//
		
	}
	
	
}
