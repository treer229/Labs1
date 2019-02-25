//하나의 클래스인 경우에
//this : 객체 자신을 가르키는 this(this.name, this.age)
//this : 생성자를 호출하는 this

//상속관계에서
//super(부모의 주소를 담고 있다) : 상속관계에서 부모자원에 접근 하는 방법
//this 역활이 동일
//1. super : 상속관계에서 부모자원 접근
//2. super : 상속관계에서 부모자원의 생성자를 명시적으로 호출

class Base {
	String basename;

	Base() {
		System.out.println("Base 클래스 기본 생성자");
	}

	Base(String basename) {
		this.basename = basename;
		System.out.println("this.basename" + this.basename);
	}

	void baseMethod() {
		System.out.println("Base.baseMethod();");
	}
}

class Derived extends Base {
	String dname;

	Derived() {
		System.out.println("Derived 클래스 기본 생성자");
	}

	Derived(String dname) {
		super();
		this.dname = dname;
		System.out.println("this.dname" + this.dname);
	}
	@Override
	void baseMethod() {
		System.out.println("재정의");
	}
	void P_method() {
		super.baseMethod(); // 부모의 자원에 접근하는 super
	}
}

public class Ex06_Inherit_Super {
	public static void main(String[] args) {
		Derived d = new Derived();

	
	}
	
}
