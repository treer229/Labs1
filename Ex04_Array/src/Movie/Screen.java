package Movie;

import java.util.Scanner;

public class Screen {
	Scanner scan = new Scanner(System.in);
	
	public void menu() {
		System.out.println("******************");
		System.out.println("****메뉴를 선택하세요*****");
		System.out.println("***0.등록 및 환불하기****");
		System.out.println("***1.자리확인하기***");
		System.out.println("***2.종료 하기*******");
		System.out.println("*********************");
		System.out.println("******************");
	
	}
	
	
	public void scrr() {
	A: while (true) {
				menu();
				String choice =scan.nextLine();
				
				switch (choice) {
				case "0":
					System.out.println("자리 등록 및 환불");
					
					
					break;
				case "1":
					Jaribogi jari = new Jaribogi();
					jari.jari();
					break;
				case "2":
					System.out.println("종료됩니다");
					break A; 
				default:
					System.out.println("DEFAULT");
				}
		}
	}	
}
