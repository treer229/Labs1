
public class Star2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) { // ������ ���� 12345
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 6; j++) {
				if (i == j)
					break;
				System.out.print("*");
			}
			System.out.println();
			for(int j=1; j<=6; j++) {
				
			}
		}
		for(int i =1; i<= 6; i++) {
			for(int j=1; j<=6; j++) {
				if (i>=j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for(int j=1; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	 	
	}
}