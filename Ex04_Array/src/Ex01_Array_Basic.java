import java.util.Arrays;

/*
 �迭�� ��ü��.
 
 */
public class Ex01_Array_Basic {
	public static void main(String[] args) {
		int[] score = new int[3];
	
		System.out.println("�ּҰ��� ���´�: "+score);
		
		//Array ������ ���� ������ �ִ�(�� ���� ũ��� Ÿ�Կ� ������)
		//������ �濡 ���� ������: ÷��. index�� ���� : ���� ������ 0
		
		//score[0] , score[1], score[2] (�迭�� ����_length) 3��
		System.out.println("���� ���´�: "+score[0]);
		System.out.println("���� ���´�: "+score[1]);
		score[2] = 33;
		System.out.println("���� ���´�: "+score[2]);
		//�迭�� ������ ÷�� ���� : length = 1;
		//�迭�� Ÿ���� default ���� ������.
		
		
		//score[3] = 500;
//		 java.lang.ArrayIndexOutOfBoundsException �׸� �� ���ô�....
	//Array�� ������ ���� ���� ���? => for
		for(int i = 0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		String result = Arrays.toString(score);
		System.out.println(result);
		
		Arrays.sort(score);//�������� �����ִ°�
		
		//POINT(�ϱ�)
		int[] arr = new int[5];
		int[] arr2 = new int[] {100,200,300};
		int[] arr3 = {11,12,13,14,15,16}; //�����Ϸ��� ���������� new�� �����
		
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+"\t");
		}
	}
}
