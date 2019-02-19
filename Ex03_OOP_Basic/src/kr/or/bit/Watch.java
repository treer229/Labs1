package kr.or.bit;

public class Watch {
	private String Brand = "뻐꾸기";
	private int Price = 15000;
	private int Sec;
	private int Min;
	private int Hou;

	static int count;

	Watch() {
		count += 1;
	}

	public void time() {
		System.out.println("시간" + Hou);
		System.out.println("분" + Min);
		System.out.println("초" + Sec);
	}

	public void changetime(int Hou, int Min) {
		if ((Hou > 0 && Hou < 13) && (Min > 0 && Min < 61)) {
			this.Hou = Hou;
			this.Min = Min;
		}
	}

	public void changetime(int Hou, int Min, int Sec) {
		if ((Hou > 0 && Hou < 13) && (Min > 0 && Min < 61) && (Sec > 0 && Sec < 61)) {
			this.Hou = Hou;
			this.Min = Min;
			this.Sec = Sec;
		}
	}
}
