import java.util.Scanner;

public class Ex11_statement {
	public static void main(String[] args) {
		int i = 10;
		while (i >= 10) {
			--i;
			System.out.println(i);
			// �ݵ�� ���ο��� ������� �������� ó���ؾߵȴ�
			;
		}
//		int sum = 0;
//		int j = 1;
//		while(j <= 100) {
//			sum += j;
//			j++;
//		}
//		System.out.println(sum);
//		
		// while�� ������ ¥��
		int ii = 2;
		int jj = 1;
		while (ii <= 9) {
			jj = 1;
			while (jj <= 9) {
				System.out.printf("%d * %d = %d\t", ii, jj, ii * jj);
				jj++;
			}
			System.out.println();
			ii++;
		}
//		do~while : ������ ����(������ �ѹ� ���� �� ���� ���� �Ǵ�)
		//do {���๮} while(���ǽ�)
//		�޴� ����
//		1.�λ�
//		2.�޿�
//		1�Է��ϸ� �λ� ..... 2 �Է��ϸ� �޿� .... 3�� �Է� �ٽ��Է� ����
		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		sc.nextLine();
		do {
			System.out.println("0~10");
			inputdata = Integer.parseInt(sc.nextLine());
		} while(inputdata > 10);
		System.out.println("����� �Է��� ���ڴ� " + inputdata + " �Դϴ�.");
		// while�� Ż���� ������ false�϶� while Ż��
	}
}