import java.util.Scanner;

public class MediNum {
	public static void main(String[] args) {
	int[] A = new int[100];
	Scanner sc = new Scanner(System.in);
	int B = Integer.parseInt(sc.nextLine());
	int[] a = new int[B];
	int count = 0;
	
	for(int i = 0; i<a.length; i++) {

		a[i] = i+1;
		
		if(B%a[i] == 0) {
			A[count] = a[i];
			count++;
		}
	}
		
	for(int value : A) {
		System.out.println(value);
	}
	}
	
	
}
