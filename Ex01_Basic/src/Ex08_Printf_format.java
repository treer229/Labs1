import java.util.Scanner;

public class Ex08_Printf_format {

	public static void main(String[] args) {
		//java.lang package �Ʒ� �ִ� �ڿ�(import) ���� ���� ���� ��� ����
		//default open �Ǿ� �־
		// C# : Console.WriteLine()
		// C# : Console.ReadLine()
		// java : System.out.println();
		System.out.print("B");
		System.out.println("C");
	
		//fotamt�� ����
		//%d 10���� ����
		//%f �Ǽ�
		//%s ���ڿ�
		//%c ����
		//Ư������ : \t(��Ű) , \n(�ٹٲ�)
		int num = 100;
		System.out.printf("num ����: %d�Դϴ�\n", num);
		System.out.printf("num ����: [%d]�Դϴ�. �׸��� [%d]�� �־��\n", num, 1000 );
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("%f", f);
		System.out.println();
		System.out.printf("���ڿ� ���� %s�� ����ϰ� %d ���� ���� ���\n", "�ȳ�",100 );
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
	int value = Integer.parseInt(sc.nextLine());
	
	
//		System.out.println("���ڰ��� �Է��ϼ���");
//		int number = sc.nextInt();
//		System.out.println(number);
//		Ÿ�Ժ��� read �ϴ� �Լ��� �����Ѵ�.
//		������ nextLine(); Int�� ���װ��� �־��
//		������� : �׳� ���ڷ� read�ؼ� �ʿ��ϴٸ� ��ȯ�ؼ� �����
//		Today point 
//		���ڸ� => ���ڷ� �ٲٴ°�
//		Integer.parseInt();
//		int => Integer ����Ÿ�Կ� ���� Ŭ����ȭ ��Ų�� ����
	int va = Integer.parseInt(sc.nextLine()); //String ���� int��
	String st = String.valueOf(10); //int���� ���ڷ�
	System.out.println(st);
	}
}
