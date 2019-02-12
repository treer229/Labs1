package kr.or.bit;
/*
요구사항정의
Tv는 채널정보를 가지고 있다(예를 들면 1~250채널)
Tv는 브랜드 이름을 가지고 있다. (Three Star, Lucky gold)
TV는 채널 전환 기능을 가지고 있다. (채널을 변경할 수 있따. 한단계씩)
Tv는 전원을 가지고 있다.
Tv를 키지 않은 상태에서 채널변경이 불가능하다.
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
