
public class TeamPro {
	public static void main(String[] args) {
		System.out.println("����(1), ����(2), ��(3)");
		int ply = (int) ((Math.random() * 3) + 1);
		System.out.println(ply);
		int com = (int) ((Math.random() * 3) + 1);
		System.out.println(com);
		
		String win = "����� �̰���ϴ�.";
		String lose = "����� �����ϴ�.";
		String drow = "����� �����ϴ�";
		String result = "";
		
		if (ply == com) {
			result = drow;
		} else if (ply - com == -1 || ply - com == 2) {
			result = lose;
		} else {
			result = win;
		}
		System.out.println(result);
		for(int i = 65; i <= 90; i++ ) {
			System.out.print((char)i+"\t");
		}
	}
}
//���� 1 
//���� 2
//��  3
