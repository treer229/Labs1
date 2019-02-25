import java.util.Scanner;

public class Vending {

public class AutoCigaMachine {
	private String[] name = { "말보로 레드", "말보로 화이트", "말보로 골드" };
	private int[] count = { 30, 30, 30 };
	private Scanner sc = new Scanner(System.in);
	private int jumin, menuNum, countNum, cardcash;
	private int pay, total;
	private boolean ck = true;

	public void start() {
		// 자판기 오픈
		do {
			menu();
			System.out.println("나이 확인 !");
			System.out.println("나이를 입력하세요");

			// 주민번호 입력받고 체크
			jumin = sc.nextInt();
			sc.nextLine();

			if (juminCk(jumin)) {
				System.out.println("구매가능 !");
				System.out.println("구매할 담배를 선택하세요");
				menu();
				// 메뉴값 받아오기
				do {
					menuNum = Integer.parseInt(sc.nextLine());
					if (menuNum < 1 || menuNum > 3)
						System.out.println("1~3메뉴에서 고르세요 !");
				} while (menuNum < 1 || menuNum > 3);
				// 몇개를 구매할지 카운트받기
				System.out.println(name[menuNum - 1] + "을 선택하였습니다. 몇개 구매하겠습니까?");
				countNum = sc.nextInt();
				sc.nextLine();
				// 갯수가 구매할수 있는지 체크
				if (countCk(menuNum, countNum)) {
					System.out.println("구매가능 ! ");
					total=4500*countNum;
					System.out.println("총 금액 : " + total);
					System.out.println("구매 방법 선택 !");
					cardcash();
					// 구매방법 선택
					do {
						cardcash = Integer.parseInt(sc.nextLine());
						if (cardcash < 1 || cardcash > 2)
							System.out.println("1, 2 값만 입력하세요 !");
					} while (cardcash < 1 || cardcash > 2);

					switch (cardcash) {
					case 1:
						card();
						break;
					case 2:
						cash(countNum);
						break;
					}

					// 계산 완료후 원래 갯수에서 구매한 만큼 차감
					System.out.println("결제 완료 ! ");
					System.out.println();
					count[menuNum - 1] -= countNum;
				} else
					System.out.println("수량 오류 !");
			} else
				System.out.println("미성년자에게는 안팔아 !");

			// 모든 메뉴의 갯수가 0이되면 프로그램 종료
			if (count[0] == 0 && count[1] == 0 && count[2] == 0) {
				System.out.println("수량이 다 떨어졌습니다.");
				System.out.println("자판기 종료");
				System.exit(0);
			}
		} while (true);
	}
	//카드결제진행
	private void card() {
		System.out.println("카드 계산 입니다...");
		System.out.println();
	}

	//현금결제진행
	private void cash(int countNum) {
		do {
			System.out.println("현금 계산 입니다...");
			System.out.println("금액을 넣어주세요");
			pay = sc.nextInt();
			sc.nextLine();

			if (pay >= total) {
				System.out.println("잔돈은 " + (pay - total) + "원 입니다");
				ck = false;
			} else {
				System.out.println(total - pay + "원 부족!");
				total-=pay;
				ck = true;
			}
		} while (ck);
	}

	//메뉴판
	private void menu() {
		System.out.println("===================================");
		System.out.println("1.말보로 레드		수량 : " + count[0]);
		System.out.println("2.말보로 화이트		수량 : " + count[1]);
		System.out.println("3.말보로 골드		수량 : " + count[2]);
		System.out.println("===================================");
	}

	//카드,현금 선택
	private void cardcash() {
		System.out.println("===================================");
		System.out.println("1. 카드 계산");
		System.out.println("2. 현금 계산");
		System.out.println("===================================");
	} 

	//수량 체크
	private boolean countCk(int menuNum, int countNum) {
		if (countNum <= 0 || countNum > count[menuNum - 1]) {
			return false;
		}
		return true;

	}

	//나이 체크
	private boolean juminCk(int jumin) {
		if (jumin > 19)
			return true;
		else
			return false;
	}
}
}
