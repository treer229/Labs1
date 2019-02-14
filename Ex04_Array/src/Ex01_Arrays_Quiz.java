
public class Ex01_Arrays_Quiz {

	public static void main(String[] args) {
//		int[] score = new int[] { 79, 88, 97, 54, 56, 95 };
//		int max = score[0];
//		int min = score[0];
//
//		int a = 0;
//		int b = 0;
//		int c = 0;
//
//		for (int i = 0; i < score.length; i++) {
//			max = ((score[i] > max) ? score[i] : max);
//			min = ((score[i] < min) ? score[i] : min);
//		}
//
//		System.out.println(max);
//		System.out.println(min);
//
//		int[] number = new int[10];
//		for (int i = 0; i < number.length; i++) {
//			number[i] = i + 1;
//			System.out.println(number[i]);
//		}

		// 5과목 시험 봤음
//		int sum = 0;
//		float average = 0f;
//		int[] jumsu = { 100, 55, 90, 60, 78 };
//		System.out.println(jumsu.length);
//		for (int i = 0; i < jumsu.length; i++) {
//			sum += jumsu[i];
//			if (i == jumsu.length - 1) {
//				average = sum / (float) jumsu.length;
//			}
//		}
//		System.out.printf("%d %d %f", jumsu.length, sum, average);

		// 난수 1~45 뽑고
		// 배열에 넣기?
//		int random = 0;
//		int[] box = new int[6];
//
//		for (int i = 0; i < box.length; i++) {// 중복값 상관없는 문제
//			random = (int) ((Math.random() * 90) / 2) + 1;
//			box[i] += random;
//			System.out.println(box[i]);
//		}
		
		int[] box1 = new int[6];
		
		for (int i = 0; i < 6; i++) {// 중복값 상관없는 문제
			box1[i] = ((int) (Math.random() * 45)) + 1;
			for (int j = 0; j < i; j++) {
				if (box1[i] == box1[j]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < box1.length; i++) {
			System.out.println(box1[i]);
		}
//		tmp c=0;
//		box1[i]=c;
//		box1[i+1]=box1[i];
//		box1[i+1]=c;
//	
	}
}
