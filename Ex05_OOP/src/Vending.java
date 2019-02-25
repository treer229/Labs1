import java.util.Scanner;

public class Vending {

public class AutoCigaMachine {
	private String[] name = { "������ ����", "������ ȭ��Ʈ", "������ ���" };
	private int[] count = { 30, 30, 30 };
	private Scanner sc = new Scanner(System.in);
	private int jumin, menuNum, countNum, cardcash;
	private int pay, total;
	private boolean ck = true;

	public void start() {
		// ���Ǳ� ����
		do {
			menu();
			System.out.println("���� Ȯ�� !");
			System.out.println("���̸� �Է��ϼ���");

			// �ֹι�ȣ �Է¹ް� üũ
			jumin = sc.nextInt();
			sc.nextLine();

			if (juminCk(jumin)) {
				System.out.println("���Ű��� !");
				System.out.println("������ ��踦 �����ϼ���");
				menu();
				// �޴��� �޾ƿ���
				do {
					menuNum = Integer.parseInt(sc.nextLine());
					if (menuNum < 1 || menuNum > 3)
						System.out.println("1~3�޴����� ������ !");
				} while (menuNum < 1 || menuNum > 3);
				// ��� �������� ī��Ʈ�ޱ�
				System.out.println(name[menuNum - 1] + "�� �����Ͽ����ϴ�. � �����ϰڽ��ϱ�?");
				countNum = sc.nextInt();
				sc.nextLine();
				// ������ �����Ҽ� �ִ��� üũ
				if (countCk(menuNum, countNum)) {
					System.out.println("���Ű��� ! ");
					total=4500*countNum;
					System.out.println("�� �ݾ� : " + total);
					System.out.println("���� ��� ���� !");
					cardcash();
					// ���Ź�� ����
					do {
						cardcash = Integer.parseInt(sc.nextLine());
						if (cardcash < 1 || cardcash > 2)
							System.out.println("1, 2 ���� �Է��ϼ��� !");
					} while (cardcash < 1 || cardcash > 2);

					switch (cardcash) {
					case 1:
						card();
						break;
					case 2:
						cash(countNum);
						break;
					}

					// ��� �Ϸ��� ���� �������� ������ ��ŭ ����
					System.out.println("���� �Ϸ� ! ");
					System.out.println();
					count[menuNum - 1] -= countNum;
				} else
					System.out.println("���� ���� !");
			} else
				System.out.println("�̼����ڿ��Դ� ���Ⱦ� !");

			// ��� �޴��� ������ 0�̵Ǹ� ���α׷� ����
			if (count[0] == 0 && count[1] == 0 && count[2] == 0) {
				System.out.println("������ �� ���������ϴ�.");
				System.out.println("���Ǳ� ����");
				System.exit(0);
			}
		} while (true);
	}
	//ī���������
	private void card() {
		System.out.println("ī�� ��� �Դϴ�...");
		System.out.println();
	}

	//���ݰ�������
	private void cash(int countNum) {
		do {
			System.out.println("���� ��� �Դϴ�...");
			System.out.println("�ݾ��� �־��ּ���");
			pay = sc.nextInt();
			sc.nextLine();

			if (pay >= total) {
				System.out.println("�ܵ��� " + (pay - total) + "�� �Դϴ�");
				ck = false;
			} else {
				System.out.println(total - pay + "�� ����!");
				total-=pay;
				ck = true;
			}
		} while (ck);
	}

	//�޴���
	private void menu() {
		System.out.println("===================================");
		System.out.println("1.������ ����		���� : " + count[0]);
		System.out.println("2.������ ȭ��Ʈ		���� : " + count[1]);
		System.out.println("3.������ ���		���� : " + count[2]);
		System.out.println("===================================");
	}

	//ī��,���� ����
	private void cardcash() {
		System.out.println("===================================");
		System.out.println("1. ī�� ���");
		System.out.println("2. ���� ���");
		System.out.println("===================================");
	} 

	//���� üũ
	private boolean countCk(int menuNum, int countNum) {
		if (countNum <= 0 || countNum > count[menuNum - 1]) {
			return false;
		}
		return true;

	}

	//���� üũ
	private boolean juminCk(int jumin) {
		if (jumin > 19)
			return true;
		else
			return false;
	}
}
}
