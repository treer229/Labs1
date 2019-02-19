class Tv extends Vcr {
	boolean power;
	int ch;

	void power() {
		this.power = !this.power;
	}

	void chUp() {
		this.ch++;
	}

	void chDown() {
		this.ch--;
	}
}

class Vcr {//비디오 플레이어
	boolean power;
	
	void power() {
		this.power = !this.power;
	}
	
	void play() {
		System.out.println("재생하기");
	}
	
	void stop() {
		System.out.println("정지");
	}
	
	void rew() {}
	void ff() {}
}

class TvVcr extends Tv {
	Vcr vcr;
	TvVcr() {
		vcr = new Vcr();
	}
}

//vcr기능과 tv기능을 다 갖춘 설계도를 작성해달라

public class Ex03_Inherit_Single {
	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		t.power();
		System.out.println(t.power);
		t.chUp();
		t.chUp();
		t.chUp();
		System.out.println(t.ch);
	}
}
