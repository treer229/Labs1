
public class Ex10_Statement {
	public static void main(String[] args) {
		/*
		 * 제어문 조건문(분기문) : if(단일, else, else if), switch() case break.. 반복문 : for(반복횟수),
		 * while(조건이 일치하면 무한 반복), do while() 강제적 실행 break(블럭을 탈출해라 {}이거), countinue(아래
		 * 구문 skip)
		 */

		int count = 0;
		if (count < 0)
			System.out.println("True ");
		char data = 'A';
		switch (data) {// 조건값으로 " 숫자, char, String 가능
		case 'A':
			System.out.println("true");
			break;
		case 'b':
			System.out.println("false");
			break;
		default:
			System.out.println("bye");
		}

		// 반복문
		int sum = 0;
		// for문을 사용해서 1~10까지의 홀수의 합
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

		// 입사시험 대표적인 문제(구구단) : 변형
		// for(중첩포문) , while
		// Key Point (break(탈출), countinue(스킵)
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
//				if (i == j) continue; 건너뛰기
				if (i == j)
					break;
//				System.out.printf("%d * %d = %d\t ", i, j, i * j);
			}
			System.out.println();
		}
		for (int i = 2; i <= 9; i++) {// 직각 삼각형 왼쪽 정렬
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 100; i >=0; i--) {//시작값을 큰값으로...
			System.out.println("i : " + i);
		}
	}
}
