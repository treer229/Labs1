
//������ , ���
public class Ex07_Operation {

	public static void main(String[] args) {
		int sum = 0;
//		���Կ����� (+=, -=, *=, /=);
		sum += 1;
		sum -= 1;
		int count = 0;
		count++;
		count--;
		System.out.println(count);
		// ������ ���� ����
		// x > 89 = A
		// x > 94 = A
		int score = 100;
		String grade = "";
		System.out.println("����� ������: " + score);
		if (score >= 90) {
			grade = "A";
			if (score >= 95)
				grade += "+";
			else
				grade += "-";
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85)
				grade += "+";
			else
				grade += "-";

		} else if (score >= 70) {
			grade = "C";
			if (score >= 75)
				grade += "+";
			else
				grade += "-";

		} else if (score >= 60) {
			grade = "D";
			if (score >= 65)
				grade += "+";
			else
				grade += "-";

		} else {
			grade = "F";
		}
		System.out.println("����� ������: " + grade);

		// �б⹮(switch)
		int data = 100;
		switch (data) {
		case 100:
			System.out.println("100");
			break;
		case 200:
			System.out.println("200");
			break;
		case 300:
			System.out.println("300");
			break;
		default:
			System.out.println("false");
		}

		// break; ������ ��� �ȴ�.
		switch (data) {
		case 100:
			System.out.println("1");
		case 200:
			System.out.println("2");
		case 300:
			System.out.println("3");
		default:
			System.out.println("f");
		}

		int month = 5;
		String res = "";
		switch (month) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		case 5:
			System.out.println("5");
		case 6:
			System.out.println("6");
		case 7:
			System.out.println("7");
		case 8:
			System.out.println("8");
		case 9:
			System.out.println("9");
		case 10:
			System.out.println("10");
		case 11:
			System.out.println("11");
		case 12:
			System.out.println("12");
		}
		// ��������
//		https://docs.oracle.com/javase/8/docs/api/index.html
//		package (���� : �� ������ ����)
//	    interface , class ��� �־��
//		���а迭 �ϰ�;�
//		java.lang.math�� class�� �ִ���
//		���� ���������, �θ� ������, �ڿ��� �� ������ �ְ� �̷��� ���°� reference�� ���°ž�
//		Random(); 
//	a pseudorandom double greater than or equal to 0.0 and less than 1.0. == 0.0~1.0 ������ ���� �߻�
// class�� static �ڿ��� ������ �ִٸ� new ���̵� ��밡��
//		java.lang.Math m = new java.lang.Math(); ���Ǽ�?, java ���Ͽ� default ����Ǿ��ִ�.
// 		M.random();
		System.out.println((int)((Math.random()*10)+1));
		
		int jumsu = (int)((Math.random()*10)+1)*100;
		System.out.println(jumsu);
		
		
		//���� ����
		/*
		 * ��ǰ��õ
		 * 1000�� Tv, NoteBook, �����, �ѿ켼Ʈ, ����
		 * 900�� NoteBook, �����, �ѿ켼Ʈ, ����
		 * 800�� �����, �ѿ켼Ʈ, ����
		 * 700�� �ѿ켼Ʈ, ����
		 * 600�� ����
		 * �׿ܴ� 100~500 ������ ĩ��
		 */
		String object = "";
		switch(jumsu) {
		case 1000:object += "Tv, ";
		case 900: object += "NoteBook, ";
		case 800: object += "�����, ";
		case 700: object += "�ѿ켼Ʈ, ";
		case 600: object += "����";
		break;
		default : object = "ĩ��";
		}
		System.out.println("����� ������ "+jumsu+"�� �Դϴ�.");
		System.out.println("����� " + object + " �� ��÷ �Ǽ̽��ϴ�.");
	}

}
