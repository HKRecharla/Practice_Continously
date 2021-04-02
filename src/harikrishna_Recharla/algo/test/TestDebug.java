package harikrishna_Recharla.algo.test;

public class TestDebug {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 7, 8, 9, 1, 5};
		int low=-1;
		int high=10;
		
		int pivot = arr[arr.length-1];
		
		for (int j = low; j < arr.length-1; j++) {
			low++;
			System.out.println(arr[low]);
			
			
		}
	}

}
