import java.util.Scanner;

public class Screen {

	public void menu() {
		System.out.println("******************");
		System.out.println("****메뉴를 선택하세요*****");
		System.out.println("***1.로또 번호 추출하기***");
		System.out.println("***2.종료 하기*******");
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
					System.out.println("다시하세요");
					break;
				case 1:
					Random random = new Random();
					random.sujadon();
					break;
				case 2:
					System.out.println("종료됩니다");
					break A; 
				default:
					System.out.println("DEFAULT");
				}
		}
	}	
}
