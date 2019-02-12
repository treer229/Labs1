import kr.or.bit.Car;

public class Ex03_Modifier {
	public static void main(String[] args) {
		Car car = new Car();
		car.setWindow(10);
		System.out.println(car.getWindow());
		
		car.setSpeed(100);
		System.out.println(car.getSpeed());
		car.speedUP();
		System.out.println(car.getSpeed());
		car.speedUP();
		System.out.println(car.getSpeed());
		car.speedUP();
		System.out.println(car.getSpeed());
		
	}
}