package Movie;

public class Jaribogi { // 6x6 ¹è¿­¿¡
	private String[][] mv;
	static String[][] mv2;
	
	public Jaribogi() {
		mv = new String[6][6];
	}
	
	public String[][] jari() {
		for (int i = 0; i < mv.length; i++) {
			for (int j = 0; j < mv[i].length; j++) {
				int num = 0;
				String p = Integer.toString(num++);
				mv[i][j] = p;
				if (mv[0][0] == "0\t") {
					mv[0][0] = " ";
				}
			}
			for (int j = 1; j < mv.length; j++) {
				String[] st = { "A\t", "B\t", "C\t", "D\t", "E\t" };
				mv[j][0] = st[j - 1];
			}
			for (int j = 1; j < mv.length; j++) {
				String[] st = { "\t1\t", "2\t", "3\t", "4\t", "5\t" };
				mv[0][j] = st[j - 1];
			}
			for(int j = 0; j< mv.length; j++) {
				System.out.print(mv[i][j]);
				if(j==5) {
					System.out.println();
				}
			}
		}
		return mv2 = mv;
	}
}
