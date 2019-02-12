package kr.or.bit;

public class Computer {
	public String Maker;
	public String ModelName;
	public int MacLo;
	public String Case;
	public int IpAdress;
	public boolean power;
	
	private int random() {// cpu, 메모리, 네트워크의 수치를 지정해준다
		return ((int)(Math.random()*100))+1;
	}
	
	public int memoryState(int datasize, int RamSpeed) {//메모리 사용량을 알 수 있다.
		return random();
	}
	
	public int netWorkState(int datasize, int InternetSpeed) {//네트워크의 상태를 알수있다.
		return random();
	}
	
	public int CpuState(int datasize, int CPU클럭 ) {//CPU의 사용량을 알 수 있다.
		return random();
	}
	
	public boolean powerOn() {//컴퓨터는 전원을 킬수 있다.
		return true;
	}
	public boolean powerOff() {//컴퓨터는 전원을 끌 수 있다.
		return false;
	}
	
	public Input KyMo(Input Kyboard, Input Mouse) {//컴퓨터는 입력장치의 유무를 확인할 수 있다.
		return "Input System on";
	}
	
	public Calcul BonChe
	(Calcul CPU, Calcul Dram,Calcul GPU,Calcul MainBoard,Calcul Power,Calcul SSD) {//컴퓨터는 연산장치의 유무를 확인할 수 있다.
		return "Input System on";
		return "CalCulation System on";
	}
	
	public Output MoiSp(Output Moniter, Output Speaker) {//컴퓨터는 출력장치의 유무를 확인할 수 있다.
		return "Output System on";
	}
}
