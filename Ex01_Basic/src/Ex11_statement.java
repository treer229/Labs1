import java.util.Scanner;

public class Ex11_statement {
	public static void main(String[] args) {
		int i = 10;
		while (i >= 10) {
			--i;
			System.out.println(i);
			// 반드시 내부에서 명시적인 증가감을 처리해야된다
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
		// while로 구구단 짜기
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
//		do~while : 강제적 실행(무조건 한번 실행 그 이후 조건 판단)
		//do {실행문} while(조건식)
//		메뉴 구성
//		1.인사
//		2.급여
//		1입력하면 인사 ..... 2 입력하면 급여 .... 3번 입력 다시입력 강제
		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		sc.nextLine();
		do {
			System.out.println("0~10");
			inputdata = Integer.parseInt(sc.nextLine());
		} while(inputdata > 10);
		System.out.println("당신이 입력한 숫자는 " + inputdata + " 입니다.");
		// while문 탈출은 조건이 false일때 while 탈출
	}
}