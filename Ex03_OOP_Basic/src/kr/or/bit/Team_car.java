package kr.or.bit;

public class Team_car {
	
	private String name;
	private int price;
	private int mileage; //연비
	private int maxSpeed;
	private int maxPower;
	
	Team_car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void Music(Usb data) {
		System.out.println("노래 출력");
	}
	public void Music(bluetooth data) {
		System.out.println("노래 출력");
	}
	public void Music(wifi data) {
		System.out.println("노래 출력");
	}
	
	public void Info() {
		System.out.println(price);
		System.out.println(mileage);
		System.out.println(maxSpeed);
		System.out.println(maxPower);
	}
	
}
