import java.util.Scanner;

public class Random {
	public int[] box1;
	public int r;

	Random() {
		this.box1 = new int[6];
		Scanner scan = new Scanner(System.in);
		r = (int)(Math.random()*45+1);
	}

	public boolean lottoAv(int[] box1) {

		int sum = 0;
		int aver = 0;
		for (int i = 0; i < box1.length; i++) {
			sum += box1[i];
		}
		aver = sum / box1.length;
		return (aver >= 10 && aver <= 10);
	}

	public void lottoNum() {
		for (int i = 0; i < 6; i++) {// �ߺ��� ������� ����
			box1[i] = ((int) (Math.random() * 45)) + 1;
			for (int j = 0; j < i; j++) {
				if (box1[i] == box1[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < box1.length; i++) {
			System.out.println(box1[i]);
		}
	}

	public void sujadon() {
		System.out.println("���ϴ� ���ڸ� �Է��ϼ��� �ڵ��� ����ϸ� 0�� �����ּ���");
			sudong();
			jadong("end");

	}

	public void sudong() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d��° ���ڸ� �Է����ּ���\n", i + 1);
			box1[i] = Integer.parseInt(scan.nextLine()); // �迭�� ����ִ�
			for (int j = 0; j < i; j++) {
				if (box1[i] == 0) { // 0�̸� Ż��
					break;
				} else if (box1[i] == box1[j]) { // 0�� �ƴ� �ߺ��Ǵ� ���ϰ�� ���
					i--;
					System.out.println("�ߺ��� ���ڴ� �Ұ����մϴ�.");
				} 
			}
		}
	}
	public void jadong(String end) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {//
			if (box1[i] == 0)
				box1[i] = r;//(int)(Math.random()*45+1);���� ����
			for (int j = 1; j < i; j++) {
				if (box1[i] == box1[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < box1.length; i++) {
			System.out.println(box1[i]);
		}
		
	}
}
