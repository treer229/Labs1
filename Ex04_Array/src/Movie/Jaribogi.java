package Movie;

public class Jaribogi { // 6x6 ¹è¿­¿¡
	private String[][] mv;

	private Jaribogi() {
		mv = new String[6][6];
	}
	
	public String[][] jari() {
		for (int i = 0; i < mv.length; i++) {
			for (int j = 0; j < mv[i].length; j++) {
				mv[i][j] = "0";
				if (mv[0][0] == "0") {
					mv[0][0] = " ";
				}
			}
			for (int j = 0; j < mv.length - 1; i++) {
				String[] st = { "A", "B", "C", "D", "E" };
				mv[j][0] = st[j - 1];
			}
			for (int j = 0; j < mv.length - 1; i++) {
				String[] st = { "1", "2", "3", "4", "5" };
				mv[0][j] = st[j - 1];
			}
		}
		return mv;
	}
}
