package Movie;

import java.util.Scanner;

public class Screen {
	Scanner scan = new Scanner(System.in);
	
	public void menu() {
		System.out.println("******************");
		System.out.println("****�޴��� �����ϼ���*****");
		System.out.println("***0.��� �� ȯ���ϱ�****");
		System.out.println("***1.�ڸ�Ȯ���ϱ�***");
		System.out.println("***2.���� �ϱ�*******");
		System.out.println("*********************");
		System.out.println("******************");
	
	}
	
	
	public void scrr() {
	A: while (true) {
				menu();
				String choice =scan.nextLine();
				
				switch (choice) {
				case "0":
					System.out.println("�ڸ� ��� �� ȯ��");
					
					
					break;
				case "1":
					Jaribogi jari = new Jaribogi();
					jari.jari();
					break;
				case "2":
					System.out.println("����˴ϴ�");
					break A; 
				default:
					System.out.println("DEFAULT");
				}
		}
	}	
}
