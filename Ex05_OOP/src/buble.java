
public class buble {
	private static void bubbleSort(int[] arr) {
		bubbleSort(arr, arr.length - 1);
	}
	
	private static void bubbleSort(int[] arr, int last) {
		if(last > 0 ) {
			for(int i =1; i <=last; i++) {
				if(arr[i-1] > arr[i]) {
					swap(arr, i -1, i);
				}
			}
			
		}
	}
	
	 public static void main(String[] args) {
		 
		 
	 }
}
