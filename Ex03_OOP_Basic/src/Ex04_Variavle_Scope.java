//연습용 (Ex04_Variable_Scope.java 파일 안에다)

class Variable{
	int iv;
	/*
	 1. member field, instance varible
	 2. 목적? 정보를 담음(상태, 고유, 참조(부품))
	 3. 특징? 초기값을 가지고 있는 놈이다이말이야
	 		초기화를 하지 않는다.(생성되는 객체마다 다른 값을 갖는다)
	 4. 생성시점(memory에 로딩되는 시점) : new라는 연산자
	 */
	static int cv;
	/*
	 1.특징 : 객체가 만들어지지 않아도 접근 가능(Math.random();)
	 2.목적 : 접근방법 >> 클래스이름.static자원
	 3.생성시점 : 프로그램이 실행(java hellow) class loader system에 의해서 클래스 정보를 읽고 (class area)
	 		   >>static 객체 생성 이전에 memory 올라가는 자원
	 */
}



public class Ex04_Variavle_Scope {
	public static void main(String[] args) {
		/*
		Variable.cv = 100; //static 변수(공유)
		
		Variable v = new Variable(); 
		v.iv = 200;
		v.cv = 303;
		*/
		System.out.println(Variable.cv);
		
		Variable v = new Variable();
		System.out.println(v.cv);

		Variable v2 = new Variable();
		System.out.println(v2.cv);
	}
}
