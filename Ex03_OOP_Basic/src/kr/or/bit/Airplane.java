package kr.or.bit;

public class Airplane {

	private int airNum;
	private String airName;
	private static int count;
	
	public Airplane() {
		count++;
	}
	
	public void airCheck() {
		System.out.printf("이름 : %s 번호 : %d\n", airName, airNum);
	}
	
	public int sellCheck() {
		return count;
	}
	
}
