import java.util.Arrays;

/*
 배열은 객체다.
 
 */
public class Ex01_Array_Basic {
	public static void main(String[] args) {
		int[] score = new int[3];
	
		System.out.println("주소값을 갖는다: "+score);
		
		//Array 각각의 방을 가지고 있다(각 방의 크기는 타입에 따른다)
		//각각의 방에 대한 접근은: 첨자. index로 접근 : 방의 시작은 0
		
		//score[0] , score[1], score[2] (배열의 개수_length) 3개
		System.out.println("값을 갖는다: "+score[0]);
		System.out.println("값을 갖는다: "+score[1]);
		score[2] = 33;
		System.out.println("값을 갖는다: "+score[2]);
		//배열의 마지막 첨자 값은 : length = 1;
		//배열은 타입의 default 값을 가진다.
		
		
		//score[3] = 500;
//		 java.lang.ArrayIndexOutOfBoundsException 그만 좀 봅시다....
	//Array와 궁합이 제일 좋은 제어문? => for
		for(int i = 0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		String result = Arrays.toString(score);
		System.out.println(result);
		
		Arrays.sort(score);//버블정렬 시켜주는것
		
		//POINT(암기)
		int[] arr = new int[5];
		int[] arr2 = new int[] {100,200,300};
		int[] arr3 = {11,12,13,14,15,16}; //컴파일러가 내부적으로 new를 써버림
		
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+"\t");
		}
	}
}
