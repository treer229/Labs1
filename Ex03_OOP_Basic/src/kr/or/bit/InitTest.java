package kr.or.bit;

public class InitTest {
	public static int cv = 1; //static ���� or class����
	public int iv = 1;
//	public void st() {
//		static int d = 1;
//		return d;
//	}
//	
	static { cv = 2;} //static �ʱ�ȭ ��, class �ʱ�ȭ ��
	{iv =2;} //�ν��Ͻ� �ʱ�ȭ ��
	
	public InitTest() {//������ �Լ�(�ʱ�ȭ : instance variable)
		cv = 3;
	}
}
