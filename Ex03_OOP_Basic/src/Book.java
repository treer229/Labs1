
public class Book {
	public String Writer;
	public String Maker;
	public int page;
	public int endPage;
	public boolean Open;

	Paper paper;
	Glue glue;
	Plastic cover;
	
	public boolean bookOn() {//å�� ����
		Open = true;
		return Open;
	}

	public void bookOff(int i) {//å�� ����
		Open = false;
		this.endPage = i;
	}

	public int lastPg() { //������ �������� ����ϴ� �޼ҵ�
		if (Open == true) {
			return endPage;
		}
	}
	public void Study(boolean Open, Person See) {
		System.out.println("���θ� �մϴ�");
	} 
}
