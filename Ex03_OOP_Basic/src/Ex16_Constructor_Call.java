
class Zcar {
	public String name;
	public int num;
	
	
	Zcar() {
		this("sj", 1); // 자기자신을 호출(생성자 함수 호출 가능)
	}
	Zcar(String name, int num) {
		this.name = name;
		this.num = num;
	}
}

class Zcar2 {
	public String color;
	public boolean sunloop;
	public int door;
	
	
	Zcar2() {
		this("red", false);
	}
	
	Zcar2(String color, boolean sunloop) { //차량의 색상과 문의 개수 선택가능
		this(color, sunloop, 4);
	}
	
	Zcar2(String color, boolean sunloop, int door) { //차량의 색상, 기어, 문 개수
		this.color = color;
		this.sunloop = sunloop;
		this.door = door;
	}
}

public class Ex16_Constructor_Call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
