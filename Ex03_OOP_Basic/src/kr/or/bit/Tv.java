package kr.or.bit;
/*
�䱸��������
Tv�� ä�������� ������ �ִ�(���� ��� 1~250ä��)
Tv�� �귣�� �̸��� ������ �ִ�. (Three Star, Lucky gold)
TV�� ä�� ��ȯ ����� ������ �ִ�. (ä���� ������ �� �ֵ�. �Ѵܰ辿)
Tv�� ������ ������ �ִ�.
Tv�� Ű�� ���� ���¿��� ä�κ����� �Ұ����ϴ�.
*/
public class Tv {
	public int channelNum = 1;
	public String brandName;
	public boolean power;
	
	public void chUp() {
		if(power = false) {
		
		}
		channelNum++;
	}
	
	public void chDown() {
		channelNum--;
	}
	
	public void powerOn() {
		power = true;
	}
	
	public void powerOff() {
		power = false;
	}
	
}
