import java.util.Scanner;

public class Ex09_Study {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해 주세요");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("연산기호를 입력해주세요");
		String st = sc.nextLine();
		System.out.println("두번째 숫자를 입력해 주세요");
		int num2 = Integer.parseInt(sc.nextLine());
		int result = 0;

//		if(st.equals("+")) {
//			result = num1+num2;
//		} else if(st.equals("*")) {
//			result = num1*num2;
//		} else if(st.equals("/")) {
//			result = num1/num2;
//		} else if(st.equals("-")) {
//			result = num1-num2;
//		} else {
//			System.out.println("기호를 잘못 입력하셨습니다.");
//			return;
//		}
//		
		switch(st) {
		case "+":
			result = num1 + num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		default:
			System.out.println("수식을 잘못 입력하셨습니다.");
		}
		System.out.println("결과: " + result);
	}
}