package harikrishna_Recharla.algo.sort;

public class InsertionSort {
	
	
	public static void main(String[] args) {
		
		
		int[] arr = {3,5,6,8,2,4,1,0,7};
		arr = insertion_ap2(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
	}
	
	
	
	public static void insert_Sort(int[] arr) {
		int n = arr.length-1;
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > key) {	
				arr[j+1] = arr[j];
				j =j-1;
			}
			arr[j+1] = key;
		}
	}

	
	public static void insert(int[] arr) {
		int n = arr.length-1;
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j= j-1;
			}
			arr[j+1] =key;
		}
	}






	public static int[] insertion_ap2(int[] arr){

		int n= arr.length;

		for (int i = 0; i < n-1; i++) {

			int key = arr[i+1];
			int j=i;

			while (j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j= j-1;
			}

			arr[j+1] = key;
		}

return arr;
	}
	
}
