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

class Vcr {//���� �÷��̾�
	boolean power;
	
	void power() {
		this.power = !this.power;
	}
	
	void play() {
		System.out.println("����ϱ�");
	}
	
	void stop() {
		System.out.println("����");
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

//vcr��ɰ� tv����� �� ���� ���赵�� �ۼ��ش޶�

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
