
public class Ex06_Operation {

	public static void main(String[] args) {
		int result =100/100;
		System.out.println(result);
		
		result = 13/2;
		System.out.println(result);
		
		result = 13%2;
		System.out.println(result); //나머지 구하기
		
		// 증가감 연산자 (++, --) 1씩 증가하거나, 1씩 감소
		int i = 10;
		++i; // 전치증가
		System.out.println(i);
		i++; // 후치증가
		System.out.println(i);
		//변수 1개 : 전치, 후치 동일
		
		// POINT : 전치와 후치가 연산자와 결합하면 본질을 드러냄
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2; //j2를 1증가시키고 + 연산
		System.out.println(result2);
		//i2>5, j2>5, result > 10
		result2 = i2 + j2++;
		System.out.println();
		//i2>5, j2>6, result > 10
		System.out.println(j2);
		
		byte b = 100; //-128~127
		byte c = 1;
		byte d = (byte)(b+c); // 일단 101 숫자가 1byte 표현...
		//1. byte d = (byte)(b + c); 쓰레기값이 발생 가능
		//2. int d = b+c; 정답
		System.out.println("d : " + d);
		
		float num2 = 10.45f;
		int num3 = 20;
		// num2 + num3 
		
		// char는 정수 타입
		char c2 = '!';
		char c3 = '!';
		int result6 = c2 +c3; //!!(x)
		// char result6 = c2+c3; int = int + int
		System.out.println(result6);
		System.out.println((char)result6);
		
		// 제어문
		// 중소기업 시험문제 (구구단 문제) => 별찍기
		int sum = 0;
		for(int j=1; j<=100; j++) {
			if(j%2==0) {
				sum += j;
				}
		}
		System.out.println("sum :" + sum);
		
		//==연산자
		//값을 비교한다 (타입X 2진법도 X) 비교연산자는 어떻게 작동한는 거냐?
		if(10 == 10.0f) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		//! 부정연산자
		if('A'!=65) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	
		//암기하자
		//제어문처럼 쓰는 연산자(삼항 연산자)
		int p = 10;
		int k = -10;
		int result0 = (p==k)? p:k;
		// ?앞에 있는 조건식 true 라면  : 앞에 있는 값을
		// ?앞에있는 조건식이 false라면 : 뒤에 있는 값을
		System.out.println(result0);
		
		if(p==k) {
			int result00 = p;
		}else {
			int result00 = k;
		}
		//3항연산자가 훨씬 편하다
		
		//연산자 |, &
		// 0과 1의 bit 연산
		int x = 3;
		int y = 5;
		System.out.println("x|y : " + (x|y));
		//진리표
		// 0: false
		// 1: true
		
		/*
		 *or
		0 0 false0 
		0 1 true1
		1 0 true1
		1 1 ture1
		
		and
		0 0 
		0 1
		1 0
		1 1
		
		sql(oracle)
		select * 
		from emp
		where job='salse' and sal > 2000;
		
		select * 
		from emp
		where job='salse' or sal > 2000;
		
		*/
		
		//Point논리연산 (||(or), &&(and))  => return boolean
		//
		
	}
	
	
}
