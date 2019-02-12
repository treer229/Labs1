
//연산자 , 제어문
public class Ex07_Operation {

	public static void main(String[] args) {
		int sum = 0;
//		대입연산자 (+=, -=, *=, /=);
		sum += 1;
		sum -= 1;
		int count = 0;
		count++;
		count--;
		System.out.println(count);
		// 간단한 학점 계산기
		// x > 89 = A
		// x > 94 = A
		int score = 100;
		String grade = "";
		System.out.println("당신의 점수는: " + score);
		if (score >= 90) {
			grade = "A";
			if (score >= 95)
				grade += "+";
			else
				grade += "-";
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85)
				grade += "+";
			else
				grade += "-";

		} else if (score >= 70) {
			grade = "C";
			if (score >= 75)
				grade += "+";
			else
				grade += "-";

		} else if (score >= 60) {
			grade = "D";
			if (score >= 65)
				grade += "+";
			else
				grade += "-";

		} else {
			grade = "F";
		}
		System.out.println("당신의 점수는: " + grade);

		// 분기문(switch)
		int data = 100;
		switch (data) {
		case 100:
			System.out.println("100");
			break;
		case 200:
			System.out.println("200");
			break;
		case 300:
			System.out.println("300");
			break;
		default:
			System.out.println("false");
		}

		// break; 구문은 없어도 된다.
		switch (data) {
		case 100:
			System.out.println("1");
		case 200:
			System.out.println("2");
		case 300:
			System.out.println("3");
		default:
			System.out.println("f");
		}

		int month = 5;
		String res = "";
		switch (month) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		case 5:
			System.out.println("5");
		case 6:
			System.out.println("6");
		case 7:
			System.out.println("7");
		case 8:
			System.out.println("8");
		case 9:
			System.out.println("9");
		case 10:
			System.out.println("10");
		case 11:
			System.out.println("11");
		case 12:
			System.out.println("12");
		}
		// 참조문서
//		https://docs.oracle.com/javase/8/docs/api/index.html
//		package (폴더 : 잘 정리된 폴더)
//	    interface , class 들어 있어요
//		수학계열 하고싶어
//		java.lang.math란 class가 있더라
//		언제 만들어졌고, 부모가 누구고, 자원은 뭘 가지고 있고 이런걸 보는게 reference를 보는거얌
//		Random(); 
//	a pseudorandom double greater than or equal to 0.0 and less than 1.0. == 0.0~1.0 사이의 난수 발생
// class가 static 자원을 가지고 있다면 new 없이도 사용가능
//		java.lang.Math m = new java.lang.Math(); 편의성?, java 파일에 default 선언되어있다.
// 		M.random();
		System.out.println((int)((Math.random()*10)+1));
		
		int jumsu = (int)((Math.random()*10)+1)*100;
		System.out.println(jumsu);
		
		
		//조별 퀴즈
		/*
		 * 경품추천
		 * 1000점 Tv, NoteBook, 냉장고, 한우세트, 휴지
		 * 900점 NoteBook, 냉장고, 한우세트, 휴지
		 * 800점 냉장고, 한우세트, 휴지
		 * 700점 한우세트, 휴지
		 * 600점 휴지
		 * 그외는 100~500 까지는 칫솔
		 */
		String object = "";
		switch(jumsu) {
		case 1000:object += "Tv, ";
		case 900: object += "NoteBook, ";
		case 800: object += "냉장고, ";
		case 700: object += "한우세트, ";
		case 600: object += "휴지";
		break;
		default : object = "칫솔";
		}
		System.out.println("당신의 점수는 "+jumsu+"점 입니다.");
		System.out.println("당신은 " + object + " 에 당첨 되셨습니다.");
	}

}
