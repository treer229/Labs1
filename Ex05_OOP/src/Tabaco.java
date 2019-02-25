
public class Tabaco {
	public int price;
	public String tabaname;
	public String[] set;

	public Tabaco(String tabaname) {
		this.tabaname = tabaname;
		for (int i = 0; i < 11; i++) {
			set[i] = this.tabaname;
		}

	}
}
