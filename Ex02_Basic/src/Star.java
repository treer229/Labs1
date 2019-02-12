
public class Star {
	public static void main(String[] args) {
//	for(int i = 0; i<=5; i++) {
//		for(int j = 0; j<=5-i; j++) {
//			if(i==j) break;
//			System.out.print("*");
//		}
//		System.out.println();
//	}
		for (int i = 1; i <= 6; i++) { // 오른쪽 정렬 12345
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
		System.out.println();
		}

//		for(int ii = 1; ii <= 6; ii++) { //왼쪽 정렬 12345
//			for(int jj = 1; jj <= 6; jj++) {
//				System.out.print("");
//				if(ii+jj>=7) {
//				System.out.print("1");
//				}
//			}
//			System.out.println();
//		}
//		
		System.out.println();

		for (int i = 1; i <= 6; i++) { // 왼쪽 정렬 12345
			for (int j = 1; j <= 6; j++) {
				if (i == j)
					break;
				System.out.print("*");
			}
			System.out.println();
			break;
		}

		for (int i = 1; i <= 5; i++) {// 합치기
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			for (int k = 1; k <= 5; k++) {
				for (int kk = 1; kk <= 5; kk++) {
					System.out.print("1");
				}
				System.out.println();
				break;
			}

//			for (int k = 1; k <= 5; k++) {
//				for (int kk = 1; kk <= 5; kk++) {
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
		for(int v=1; v<=5; v++) {
			for(int j =1 ; j<=5; j++) {
				if(v==j) break;
				System.out.printf("5");
			}
			System.out.println();
		}
//		System.out.println();
//		System.out.println();
//		for(int i=0; i<=5; i++) { //왼쪽 정렬 54321
//			for(int j =0; j<=5-i; j++) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
		}
	}
}