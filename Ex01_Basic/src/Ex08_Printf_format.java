import java.util.Scanner;

public class Ex08_Printf_format {

	public static void main(String[] args) {
		//java.lang package 아래 있는 자원(import) 선언 구문 없이 사용 가능
		//default open 되어 있어서
		// C# : Console.WriteLine()
		// C# : Console.ReadLine()
		// java : System.out.println();
		System.out.print("B");
		System.out.println("C");
	
		//fotamt을 정의
		//%d 10진수 정수
		//%f 실수
		//%s 문자열
		//%c 문자
		//특수문자 : \t(탭키) , \n(줄바꿈)
		int num = 100;
		System.out.printf("num 값은: %d입니다\n", num);
		System.out.printf("num 값은: [%d]입니다. 그리고 [%d]도 있어요\n", num, 1000 );
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("%f", f);
		System.out.println();
		System.out.printf("문자열 값은 %s로 출력하고 %d 다음 숫자 출력\n", "안녕",100 );
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요");
	int value = Integer.parseInt(sc.nextLine());
	
	
//		System.out.println("숫자값을 입력하세요");
//		int number = sc.nextInt();
//		System.out.println(number);
//		타입별로 read 하는 함수가 존재한다.
//		하지만 nextLine(); Int는 버그가좀 있어용
//		권장사항 : 그냥 문자로 read해서 필요하다면 변환해서 사용한
//		Today point 
//		문자를 => 숫자로 바꾸는것
//		Integer.parseInt();
//		int => Integer 원시타입에 대해 클래스화 시킨것 랩핑
	int va = Integer.parseInt(sc.nextLine()); //String 값을 int로
	String st = String.valueOf(10); //int값을 문자로
	System.out.println(st);
	}
}
