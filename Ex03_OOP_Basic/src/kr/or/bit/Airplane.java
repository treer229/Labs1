package kr.or.bit;

public class Airplane {

	private int airNum;
	private String airName;
	private static int count;
	
	public Airplane() {
		count++;
	}
	
	public void airCheck() {
		System.out.printf("�̸� : %s ��ȣ : %d\n", airName, airNum);
	}
	
	public int sellCheck() {
		return count;
	}
	
}
