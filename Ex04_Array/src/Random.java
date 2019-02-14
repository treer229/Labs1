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
		for (int i = 0; i < 6; i++) {// 중복값 상관없는 문제
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
		System.out.println("원하는 숫자를 입력하세요 자동을 희망하면 0을 눌러주세요");
			sudong();
			jadong("end");

	}

	public void sudong() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d번째 숫자를 입력해주세요\n", i + 1);
			box1[i] = Integer.parseInt(scan.nextLine()); // 배열에 집어넣는
			for (int j = 0; j < i; j++) {
				if (box1[i] == 0) { // 0이면 탈출
					break;
				} else if (box1[i] == box1[j]) { // 0이 아닌 중복되는 수일경우 재실
					i--;
					System.out.println("중복된 숫자는 불가능합니다.");
				} 
			}
		}
	}
	public void jadong(String end) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {//
			if (box1[i] == 0)
				box1[i] = r;//(int)(Math.random()*45+1);랜덤 생성
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
