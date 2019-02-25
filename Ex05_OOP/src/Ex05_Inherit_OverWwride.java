import kr.or.bit.Emp;

class Test {
	void Print() {
		System.out.println("부모함수 _ Test");
	}
}

class Test2 extends Test {

	@Override
	void Print() {
		super.Print();
			System.out.println("재식함수 _ Test");	
	}

}

public class Ex05_Inherit_OverWwride {
	public static void main(String[] args) {
		Test2 test = new Test2();
		test.Print();
		
		System.out.println(test);
		System.out.println(test.toString());
		Emp e = new Emp(9999, "amo");
		String str = e.toString();
		System.out.println(str);
	}
}
