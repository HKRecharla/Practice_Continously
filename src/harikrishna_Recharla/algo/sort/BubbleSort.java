package harikrishna_Recharla.algo.sort;

public class BubbleSort {

	
	
	public static void main(String[] args) {
		
		
		int[] arr = {5,7,4,1,9,0,2};
		bubbleSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
	}
	
	
	
	public static void bubbleSort(int[] arr) {
		
		int n = arr.length-1;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < n-i; j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
	}
}
