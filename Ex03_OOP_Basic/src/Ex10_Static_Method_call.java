class Data {
	int i;
}

public class Ex10_Static_Method_call {
	public static void main(String[] args) {
		Data d = new Data();
		d.i = 199;
		System.out.println(d.i);
		vcall(d.i);
	}
	
//	static void scall(Data data) { //�ּҰ� ����
//		System.out.println("�Լ�" + data.i);
//		data.i=1111;
//	}
	
	static void vcall(int x) { // ������ 
		System.out.println("before x:" + x );
		x = 9999;
		System.out.println("after x:" + x);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
}
