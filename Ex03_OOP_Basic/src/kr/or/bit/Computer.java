package kr.or.bit;

public class Computer {
	public String Maker;
	public String ModelName;
	public int MacLo;
	public String Case;
	public int IpAdress;
	public boolean power;
	
	private int random() {// cpu, �޸�, ��Ʈ��ũ�� ��ġ�� �������ش�
		return ((int)(Math.random()*100))+1;
	}
	
	public int memoryState(int datasize, int RamSpeed) {//�޸� ��뷮�� �� �� �ִ�.
		return random();
	}
	
	public int netWorkState(int datasize, int InternetSpeed) {//��Ʈ��ũ�� ���¸� �˼��ִ�.
		return random();
	}
	
	public int CpuState(int datasize, int CPUŬ�� ) {//CPU�� ��뷮�� �� �� �ִ�.
		return random();
	}
	
	public boolean powerOn() {//��ǻ�ʹ� ������ ų�� �ִ�.
		return true;
	}
	public boolean powerOff() {//��ǻ�ʹ� ������ �� �� �ִ�.
		return false;
	}
	
	public Input KyMo(Input Kyboard, Input Mouse) {//��ǻ�ʹ� �Է���ġ�� ������ Ȯ���� �� �ִ�.
		return "Input System on";
	}
	
	public Calcul BonChe
	(Calcul CPU, Calcul Dram,Calcul GPU,Calcul MainBoard,Calcul Power,Calcul SSD) {//��ǻ�ʹ� ������ġ�� ������ Ȯ���� �� �ִ�.
		return "Input System on";
		return "CalCulation System on";
	}
	
	public Output MoiSp(Output Moniter, Output Speaker) {//��ǻ�ʹ� �����ġ�� ������ Ȯ���� �� �ִ�.
		return "Output System on";
	}
}
