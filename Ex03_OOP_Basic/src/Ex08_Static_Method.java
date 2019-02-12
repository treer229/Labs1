
public class Ex08_Static_Method {
	int iv = 100;
	
	void method() {
		System.out.println("1");
	}
	static void sMethod() {
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		Ex08_Static_Method ex = new Ex08_Static_Method();
		ex.method();
		Ex08_Static_Method.sMethod();
		
		//자주쓰는 자원은 static으로 설계하는게 편하다리
		//스테틱의 존재 이유가 그렇습니다
		
	}
}
