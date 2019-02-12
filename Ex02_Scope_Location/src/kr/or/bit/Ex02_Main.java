package kr.or.bit;

public class Ex02_Main {
	public static void main(String[] args) {
		apt Apt = new apt();
		Car car = new Car();
		
		Apt.write_window(0);
		System.out.println(Apt.read_window());
		
		
	}
}
