/*
 1.���
 java : Child extends base
 c# : Child : Base
 
 2.���Ư¡
 -���߻���� �Ұ�
 -���ϻ���� ��Ģ(������ ����� ����ؼ� ���߻���� ����)

 3.�ǹ�
 ������ �ǹ� : [���뼺]�� �츮�ڴ� >> �����ڵ�� �θ� ������ �ִ�.
 ���� : �ʱ� ���� ���....
 
 ���뼺 >> ����� >> ���(�ð�, ����и�, �߻�ȭ)
 */

class GrandFather {
	public int money = 5000;
	private int mymo = 5999;
	//���������� ���� �Ұ�
	//��Ӱ��� ���� �Ұ�
	
}

class Father extends GrandFather {
	public int money2 = 3000;
}

class Son extends Father {
	public int money3 = 100;
}
public class Ex01_Inherit {
	public static void main(String[] args) {
		Son s = new Son();
		
	}
}
