import java.util.Scanner;

public class Flow_chart {
	public static void main(String[] args) {

		int unit = 10000; // ȭ�����
		int num = 0; // ȭ��ż�
		int sw = 0; // ����Ī ����, ȭ���� ���� ������ ����
		int money = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		money = Integer.parseInt(sc.nextLine());

		/*
		 * do { num = (int)money/unit;
		 * System.out.printf("unit : %d, num : %d\n",unit,num); money -= unit*num;
		 * if(sw==0) { unit /= 2; sw = 1; }else { unit /= 5; sw = 0; } }while(unit>=1);
		 */
		while (unit >= 1) {
			num = (int) money / unit;
			System.out.printf("unit : %d, num : %d\n", unit, num);
			money -= unit * num;

			if (sw == 0) {
				unit /= 2;
				sw = 1;
			} else {
				unit /= 5;
				sw = 0;
			}
		}
	}

}
