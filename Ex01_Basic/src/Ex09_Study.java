import java.util.Scanner;

public class Ex09_Study {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��� �ּ���");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("�����ȣ�� �Է����ּ���");
		String st = sc.nextLine();
		System.out.println("�ι�° ���ڸ� �Է��� �ּ���");
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
//			System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
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
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		}
		System.out.println("���: " + result);
	}
}