/*
�ڹٴ� �ý��ۿ��� �⺻������ �����ϴ� 8���� �⺻ Ÿ���� ������ �ִ�.
8���� �⺻ Ÿ���� ���� �����Ѵ�.
Tip) [��]�� [�ּ�]�� ������ �� �ִ�

���� -> ���� (��������, 0, ���� ����) -> byte(-128~127)
							  -> char(�ѹ��ڸ� ǥ���ϴ� �ڷ��� : �ѹ��ڴ� 2byte), unicode
							  -> short ...(c����� ȣȯ��)
							  -> int (-21��~21��) **java���������� �⺻Ÿ��(4byte)
							  -> long(8byte) : int���� ū��
	-> �Ǽ�(�ε��Ҽ���) - float(4byte), double(8byte)
						  ���е��� ����(=ǥ�������� ũ��) **java �Ǽ� ���� �⺻Ÿ��(double)
	-> boolean(true, false) : ���α׷��� ������
	
�ñ��ؿ� : ���ڿ��� ǥ�� : ȫ�浿, �ȳ��ϼ��� ��� ������
String�� Ŭ���� : String s = new String("�ȳ��ϼ���");
�� ���� : String s = "�ȳ��ϼ���";
String�� ���ؼ� ������ ����� �ֱ� ������ String�� intó�� ������

��Ÿ�� : �޸𸮿� ���� (����, ��)
����Ÿ�� : Ŭ����, �迭 �޸𸮿� ���� (�ּ�:����)

class == ���赵 == Ÿ��(Type)
class ���� Ÿ���� ��� ���� ūŸ��

class�� �ݵ�� �޸𸮿� �÷����� ��� (new)
 */
// �ּ��� ���赵��� �Ϸ��� >> �Ӽ�(��������) + ����(�⺻) >> ������ ǥ��

class Car{
	String color; //������ ��ڴ�
	int window; // �ڵ����� â�� ����
}




public class Ex03_DataType {

	public static void main(String[] args) {
		// �����Լ��� �ִ� class�� new�� ���� �ʾƵ� �� �� �ִ�
	Car c = new Car(); // heap �޸𸮿� ��ü�� ������� 
					   // (Stirng color�� int window�� ������)
					   // Class�� Ÿ������ ���� ����c�� �ּҰ��� ���´�
	System.out.println("c��� ������ ��" + c);
	// Car@15db9742 �ּҰ�(����) >> ����Ÿ��
	// c. <-- .�� �ּҸ� ã�� ������
	Car c2;
	c2 = c;
	
	System.out.println("c2��� ������ �� : " + c2);
	System.out.println(c==c2);
	
	Car c3;//����
	c3 = new Car(); //�Ҵ� �и� 
	System.out.println("c3��� ������ �� : " + c3);
	c3.color = "gold"; // heap �޸𸮿� �ִ� ���� �ٲ� --> �ּҰ� �Ҵ�
	c3.window = 10;
	System.out.println(c3.color + ":" + c3.window);
	
	int i = 200;
	System.out.println(i);
	//200 �޸𸮾ȿ� ���� 200 
	
	int j; //����
	j = 1000;
	//i���� ��ȭ
	
	int a, b;
	a = 10;
	b = 20;
	
	int d = 10; // �ݵ�� �ʱ�ȭ 
	int f = 20;
	
	int k = 1111;
	int k2 =k;
	k = 2222;
	
	//int (-21~21��)
	//int number = 10000000000000; ����(������ ����)
	//���� ���ͷ��� ǥ�������� [int]���� (Today point)
	// ���� ���ͷ� >> ǥ�� ���ڰ�
	// ���̻� L
	long number = 10000000000000L; //���� ���ͷ� ���� long���� ����	
	System.out.println("long Ÿ�� : " + number);
	
	//char : �������� ������ �ִ�. (2byte)
	//���ڸ� ǥ���ϴ� Ÿ��
	// 1. �ѹ��� > 2byte ����
	// 2. �ѱ����� : 2byte
	// 3. ������, ����, Ư������, ���� : 1byte
	// �ѱ�, ���� ��� �� �ѹ��� ǥ���� �ϱ� ���� 2byte
	
	// java ���ڿ� : "��" : String s "��", String s2="asdf"
	// java ����(�ѹ���) : char c= '��'
	
	char single = '��';
	System.out.println(single);
	
	char ch = 'A';
	System.out.println(ch);
	System.out.println((int)ch); //casting Ÿ�Ժ�ȯ //�ƽ�Ű �ڵ�ǥ 10������
	// A : 65, a:97
	
	char ch2 = 'a';
	System.out.println((int)ch2);
	
	int ch3 = 65;
	char c4 = (char)ch3; //����� ����ȯ >> �Ͻ��� ����ȯ�� ����
	System.out.println(c4);
	
	int cint2 = c4; //�Ͻ��� ����ȯ >> ����� �����Ϸ��� (int)c4;
	
	// Today Point
	// ������ ������ �ִ� [���� ���� ����] [������ Ÿ����] ������
	// Ÿ���� ũ�⸦ ����
	// ū Ÿ�Կ��� ���� Ÿ�԰��� ���� �� �־��
	// ���� Ÿ�Կ��� ū Ÿ�԰��� ���� �� �����
	
	int intvalue = 1; // 10�� 4byte ����
	byte bytevalue = (byte)intvalue; // int���ڸ� byte�� �־ ����
	
	System.out.println(intvalue);
	System.out.println(bytevalue); //�����Ⱚ --> 
	
	//String (���ڿ�) Ÿ��
	//String Ŭ����
	//String str = new STring("ȫ�浿");
	//POINT : String �Ϲ� ��Ÿ�� ���ŵ� ���� ������ ����� (int, double)
	
	String str =  "hello world";
	System.out.println(str);
	
	String str2 = str + "�������";
	System.out.println(str2);
	
	String str3 = "1000"; // <-- ����X. ���ڴ� �׸��̴�. �ϰ�����
	String str4 = "10";
	String result = str3 + str4; // + >> ���ڿ� + ���ڿ� (���տ�����)
	
	System.out.println(result);
	//���ڿ� ������ ������ �׳� ����

	System.out.println("100" + 100); //100100
	System.out.println(100 + "100"); //100100
	System.out.println(100 + 100 + "100"); //200100
	System.out.println(100 + (100 + "100")); //100100100
	System.out.println(100 + "100" + 100); //100100100
	
	float f1 = 3.14f; //���̻�(F, f)
	float f2 = 1.123456789f;
	System.out.println(f2);//1.1234568 // �ݿø�ó�� 7�ڸ� ǥ��
	double d1 = 1.123456789123456789;
	System.out.println(d); //1.1234567891234568
	
	double d2 = 100;
	//�����Ϸ��� ���������� �ڵ����� ����ȯ
	// double d2 = (double)100;
	double d3 = 100;
	int i5 = 100;
	
	//	int result2 = d3 + i5;
	// 1. ������ �սǾ��� ���� �� �ִ�. --> ������ ū������ �޾ƶ�
	// double result2 = d3 + i5; 
	// 2. ������ ���� �� ������ ... ���� �սǵ� �� �ִ�
	// int result2 = (int)d3 + i5; // 
	// 3. ���� �սǵ� �� �ִ�
	int result2 = (int)(d3 + i5);
	int i6 = 100;
	byte b2 = (byte)i6; // ���������	
	System.out.println(i6);
	
	byte b3 = 20;
	int i7 =b3; // ����� ���������� ����ȯ
				// �����Ϸ��� int i7 = (int)b3;
	}
}
