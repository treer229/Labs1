import java.util.Scanner;

class Tabaco {
	public int price;
	public String tabaname;
	public String[] set;

	public Tabaco(String tabaname) {

		for (int i = 0; i < 11; i++) {
			set[i] = tabaname;
		}
	}
}

public class Ciga {
	Tabaco tabaco;
	String Pdname;

	String[] Malbo= new String[20];
	Scanner sc = new Scanner(System.in);
	
	Pdname = sc.nextLine();

	public void setTabaco() {
		Tabaco taba = new Tabaco(Pdname);
		for (int i = 0; i < 11; i++) {
			Malbo[i] = taba.set[i];
		}

	}
}
