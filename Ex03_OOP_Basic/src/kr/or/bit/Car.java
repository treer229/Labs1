package kr.or.bit;
/*
 ������ modifier
 public : ����: ����(package) ���о��� ��� �ڿ� ����
 private : (���� : Ŭ���� ���ο����� �����ڿ�, �������� ���Ұ� �� �ڿ�)
 			��ü���� Ư¡ : ĸ��ȭ, ����ȭ
 1.Ŭ���� ���ο��� private int age;
 1.1 private : �����Ҵ��� ���� �����Ҵ��� ���ؼ� �ڿ� ��ȣ
 1.2 �������� �ǵ�(���ϴ� ���� ó��) age ������ 1~200 ������ ��� ����
 1.3 ĸ��ȣ������ �ڿ��� �����Ҵ��� ó���ϴ� Ư���� �Լ�
 	private member field�� read, write�� �� �� �ִ� �Լ�
 1.4 private int age;
 	-setter (0) �Լ�
 	-getter (0) �Լ�
 --�ʿ信 ���󼭴� �ϳ����� �����ص� �ȴ�.
 
 */

public class Car {
	private int window;
	private int speed;

	public Car2 s = new Car2();
	
	public void setWindow(int window) {
		this.window = window;
	}

	public int getWindow() {
		return window;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	//�ʿ��ϴٸ� �߰� �Լ�(���)
	public void speedUP() {
		speed += 10;
	}
	
	public void SpeedDown() {
		if(speed > 0) {
			speed -= 10;
		}
	}
}
