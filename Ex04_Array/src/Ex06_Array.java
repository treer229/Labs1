
class Car{
	int door;
	String color;
}


public class Ex06_Array {
	public static void main(String[] args ) {
		//2차원(행과열) : index:0;
		//[행][열];
		int[][] score = new int[3][2];
				System.out.println(score[0][0]);
				score[0][0]	= 100;
				score[0][1]	= 200;
				score[1][0]	= 300;
				score[1][1]	= 400;
				score[2][0]	= 500;
				score[2][1]	= 600;
				System.out.println(score.length);
				System.out.println(score[0].length);
				//행의 갯수 : 배열이름.length
				//열의 갯수 : 배열읾[i].lenght
				
				for(int i = 0; i<score.length; i++) {
					for(int j = 0; j <score[i].length; j++) {
						System.out.printf("score[%d][%d]=%d\n", i, j ,score[i][j]);
					}
					System.out.println();
				}
				//Today Point (Array(정적) >> Collection(동적배열))
				//개선된 for문 
				//C# : for(Type변수명 in 배열)(출력구문)
				//JAVA : for(Type : qoduf)(출력구문)
				//javascript : for(Type변수명 in 배열)(출력구문)
				
				int[] arr3 = {5,6,7,8,9,10};
				for(int value : arr3) {
					System.out.println(value);
				}
				
				String[] strarr = {"A", "B", "C","D", "FFF"};
				for(String value : strarr) {
					System.out.println(value);
				}
				
				//1차(커피)
				int[][] score3 = new int[][] {
									{11,12},
									{13,14},
									{15,16}	
				};
				
			
				for(int[] value : score3) {
					for(int value1 : value) {
						System.out.println(value1);
					}
				}
				Car[] cararr = new Car[2];
				cararr[0] = new Car();
				cararr[0].color = "red";
				cararr[0].door = 4;
				cararr[1] = new Car();
				cararr[1].color = "white";
				cararr[1].door = 6;
				//일반 포문을 사용해서 자동차의 색상과 문의 갯수를 출력
//				for(int i =0; i<cararr.length; i++) {
//					System.out.println(cararr[i].color;);
//					System.out.println(cararr[i].door;);
//				}
				for(Car value : cararr) {
					System.out.println(value.color);
					System.out.println(value.door);
				}
	}			
}
