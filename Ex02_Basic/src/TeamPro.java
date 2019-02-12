
public class TeamPro {
	public static void main(String[] args) {
		System.out.println("가위(1), 바위(2), 보(3)");
		int ply = (int) ((Math.random() * 3) + 1);
		System.out.println(ply);
		int com = (int) ((Math.random() * 3) + 1);
		System.out.println(com);
		
		String win = "당신은 이겼습니다.";
		String lose = "당신은 졌습니다.";
		String drow = "당신은 비겼습니다";
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
//가위 1 
//바위 2
//보  3
