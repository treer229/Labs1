
public class Ex10_Statement {
	public static void main(String[] args) {
		/*
		 * ��� ���ǹ�(�б⹮) : if(����, else, else if), switch() case break.. �ݺ��� : for(�ݺ�Ƚ��),
		 * while(������ ��ġ�ϸ� ���� �ݺ�), do while() ������ ���� break(���� Ż���ض� {}�̰�), countinue(�Ʒ�
		 * ���� skip)
		 */

		int count = 0;
		if (count < 0)
			System.out.println("True ");
		char data = 'A';
		switch (data) {// ���ǰ����� " ����, char, String ����
		case 'A':
			System.out.println("true");
			break;
		case 'b':
			System.out.println("false");
			break;
		default:
			System.out.println("bye");
		}

		// �ݺ���
		int sum = 0;
		// for���� ����ؼ� 1~10������ Ȧ���� ��
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
			sum += i;

		}
		System.out.println(sum);
		int sum2 = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum2 += i;
			}
		}
		System.out.println(sum2);

		// �Ի���� ��ǥ���� ����(������) : ����
		// for(��ø����) , while
		// Key Point (break(Ż��), countinue(��ŵ)
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
//				if (i == j) continue; �ǳʶٱ�
				if (i == j)
					break;
//				System.out.printf("%d * %d = %d\t ", i, j, i * j);
			}
			System.out.println();
		}
		for (int i = 2; i <= 9; i++) {// ���� �ﰢ�� ���� ����
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 100; i >=0; i--) {//���۰��� ū������...
			System.out.println("i : " + i);
		}
	}
}
