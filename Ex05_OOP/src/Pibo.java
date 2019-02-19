
public class Pibo {
	 public static void main(String[] args) {
		 int A = 1;
		 int B = 1;
		 int Y = 2;
		 int N=2;
		 int C = 0;
		 
		 int N = 2;
		 do {

			 C= A+B;
			 Y= Y+C;
			 N = N+1;
			 A=B;
			 B=C;
	
		 }while(N<=10);
		 System.out.println(Y);
	 }
}
