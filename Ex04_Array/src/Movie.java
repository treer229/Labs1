class Search {

}

public class Movie {
	private String[][] mv;

	private Movie() {
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
		}
		for (int i = 1; i < mv.length; i++) {
			String[] st = {"A", "B", "C", "D", "E"};
			mv[i][0] = st[i-1];
		}
		for (int i = 1; i < mv.length; i++) {
			String[] st = {"1", "2", "3", "4", "5"};
			mv[0][i] = st[i-1] ;
		}
		return mv;
	}

	public static void main(String[] args) {
		Movie movie = new Movie();
		String[][] jaris = movie.jari();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
					System.out.print(jaris[i][j]);
					if(j==5) {
						System.out.println();
					}
			} 
		}
	}
}
