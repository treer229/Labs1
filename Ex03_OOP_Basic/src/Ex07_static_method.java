
class StaticClass {
	int iv;
	static int cv;

	void m() {
		// 일반함수m() iv값을 처리 (0);
		// 일반함수 m() cv값을 처리(0);
		System.out.println("iv: " + iv + " , " + "cv: " + cv);
	}
	
	static void sm() {
		//일반 자원인 iv자원을 사용할 수 있다?(X)
		cv = 100;
		//끼리끼리 놀아라 그러면 error는 없을 것이니.
		//static은 static끼리 놀아라	
	}
	/*
	 일반함수 : 일반자원, static 자원 모두 사용
	 스테틱함수 : static 자원만 사용 가능
	 
	 */
}

public class Ex07_static_method {
	public static void main(String[] args) {
//		StaticClass s = new StaticClass();
		StaticClass.sm(); //아하~
		
		
	}
}
