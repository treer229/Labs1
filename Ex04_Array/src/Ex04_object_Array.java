
class Person {
	public void name() {
		System.out.println("gg");
	}

	public void age() {
		System.out.println("25");
	}
}

public class Ex04_object_Array {
	public static void main(String[] args) {
		
		Person[] objarr = new Person[3];
		
		objarr[0] = new Person();
		objarr[1] = new Person();
		objarr[2] = new Person();
		
		
		for(int i = 0; i<objarr.length; i++) {
			objarr[i] = new Person();
			System.out.println(objarr[i]);
		}
		
		Person[] parray = new Person[5];
		for(int i =0; i<parray.length; i++) {
			parray[i] = new Person();
			System.out.println(parray[i]);
		}
		
		//2. int[] arr = new int[]{10,20,30};
		Personp[] array2 = new Person[] {new Person(), new Person(), new Person()}
		
		//3.int[] arr = {10,20,30};
		Person[] array3 = {new Person, new Person, new Person()}

	
	
	}
}

}
