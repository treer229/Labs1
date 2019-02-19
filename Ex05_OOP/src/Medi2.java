import java.util.Scanner;

public class Medi2 {
	public static void main(String[] args) {
		int[] A = new int[100];
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		int C = 0;
		int D = 0;
		
		do {
			C += 1;
			if(B%C==0) {
				A[D]=C;
				D += 1;
			}
		} while(C<=B);
	for(int value : A) {
		System.out.println(value);
	}
	}
}
