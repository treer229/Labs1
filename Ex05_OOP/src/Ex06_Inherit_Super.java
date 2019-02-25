//�ϳ��� Ŭ������ ��쿡
//this : ��ü �ڽ��� ����Ű�� this(this.name, this.age)
//this : �����ڸ� ȣ���ϴ� this

//��Ӱ��迡��
//super(�θ��� �ּҸ� ��� �ִ�) : ��Ӱ��迡�� �θ��ڿ��� ���� �ϴ� ���
//this ��Ȱ�� ����
//1. super : ��Ӱ��迡�� �θ��ڿ� ����
//2. super : ��Ӱ��迡�� �θ��ڿ��� �����ڸ� ��������� ȣ��

class Base {
	String basename;

	Base() {
		System.out.println("Base Ŭ���� �⺻ ������");
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
		System.out.println("Derived Ŭ���� �⺻ ������");
	}

	Derived(String dname) {
		super();
		this.dname = dname;
		System.out.println("this.dname" + this.dname);
	}
	@Override
	void baseMethod() {
		System.out.println("������");
	}
	void P_method() {
		super.baseMethod(); // �θ��� �ڿ��� �����ϴ� super
	}
}

public class Ex06_Inherit_Super {
	public static void main(String[] args) {
		Derived d = new Derived();

	
	}
	
}
