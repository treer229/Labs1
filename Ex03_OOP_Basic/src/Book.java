
public class Book {
	public String Writer;
	public String Maker;
	public int page;
	public int endPage;
	public boolean Open;

	Paper paper;
	Glue glue;
	Plastic cover;
	
	public boolean bookOn() {//책이 열림
		Open = true;
		return Open;
	}

	public void bookOff(int i) {//책이 닫힘
		Open = false;
		this.endPage = i;
	}

	public int lastPg() { //마지막 페이지를 기억하는 메소드
		if (Open == true) {
			return endPage;
		}
	}
	public void Study(boolean Open, Person See) {
		System.out.println("공부를 합니다");
	} 
}
