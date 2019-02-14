
public class Quiz {
	public static void main(String[] args) {

			int c = 0;
			for (int i = 0; i < box1.length; i++) {
				if (box1[i] > box1[i + 1]) {
					c = box1[i];
					box1[i] = box1[i+1];
					box1[i + 1] = c;
				}
			}
			for (int i = 0; i < box1.length; i++) {
				System.out.println(box1[i]);
			}

	}
}
