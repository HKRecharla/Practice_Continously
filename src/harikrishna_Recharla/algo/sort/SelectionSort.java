package harikrishna_Recharla.algo.sort;

public class SelectionSort {
	
	
	public static void main(String[] args) {
		
		int arr[] = {64,25,12,22,11}; 
		
		SelectionSort sor = new SelectionSort();
		//sor.selection_sort(arr);
		arr = selection(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +",");
		}
		
		
	}
	
	
	
	public  void selection_sort(int[] arr) {
		
		
		int n = arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			
			
			int mid = i;
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[j] < arr[mid]) {	
					mid =j;
				}
			}
			int temp = arr[mid];
			arr[mid] = arr[i];
			arr[i] = temp;
			
		}
		
		
	}



	public static int[] selection(int[] arr){

		for (int i = 0; i < arr.length-1; i++) {

			int mid =i;

			for (int j = i+1; j <arr.length ; j++) {
				if(arr[j] < arr[mid]){
					mid =j;
				}
			}
			int temp = arr[mid];
			arr[mid] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}



























}
