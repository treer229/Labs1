package kr.or.bit;

public class Program {

	public static void main(String[] args) {
		// ��� 1�� ����
		Emp man1 = new Emp();
		man1.empno = 7788;
		man1.ename = "Dan";
		man1.job = "Killer";
		man1.setsal(-1);
		man1.getsal();
		
		String result = man1.getEmpInfo();
		System.out.println(result);
		
		Emp man2 = new Emp();
		
	}
	
}
