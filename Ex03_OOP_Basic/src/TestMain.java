import kr.or.bit.Tv;

public class TestMain {
	public static void main(String[] args) {
		Person person = new Person("ksj", 26); // ���� ������ 4byte �� ����(Person) null
		person.print();
		Person person2 = new Person("kkk", 140);
		person2.print();
		
		int number = 0; // �����Լ� �ȿ� �ִ� ��������
		
		Person you; // ����Ÿ���� �ʱ�ȭ�� �ּҰ��� ���°��̴� �̸��̾�
//		1.���������� �ʱ�ȭ (new ������)
//		   you = new Person();
//		2.�ٸ� ���� ������ ������ ���� �Ҵ� but ���� Ÿ��
		you = person; //person �� you�� ������ ����
		System.out.println(you==person);
		
		Tv tv = new Tv();
		tv.brandName = "Three Star";
//		tv.channelNum = 1;
		System.out.println(tv.channelNum);
		System.out.println(tv.brandName);
		
		tv.chUp();
		tv.chUp();
		tv.chUp();
		tv.chUp();
		tv.chUp();
		tv.chUp();
		System.out.println(tv.channelNum);
		
		
		System.out.println("�������� : " + tv.power);
		tv.powerOn();
		System.out.println("�������� : " + tv.power);

		
	}
}
