import java.util.Scanner;

public class Screen {

	public void menu() {
		System.out.println("******************");
		System.out.println("****�޴��� �����ϼ���*****");
		System.out.println("***1.�ζ� ��ȣ �����ϱ�***");
		System.out.println("***2.���� �ϱ�*******");
		System.out.println("*********************");
		System.out.println("******************");
	
	}
	
	
	public void scrr() {
	A: while (true) {
				menu();
				Scanner scan = new Scanner(System.in);
				int choice =Integer.parseInt(scan.nextLine());
				
				switch (choice) {
				case 0:
					System.out.println("�ٽ��ϼ���");
					break;
				case 1:
					Random random = new Random();
					random.sujadon();
					break;
				case 2:
					System.out.println("����˴ϴ�");
					break A; 
				default:
					System.out.println("DEFAULT");
				}
		}
	}	
}
