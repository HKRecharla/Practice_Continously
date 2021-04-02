package harikrishna_Recharla.algo.linearSearch;

public class LinearSearch {
	
	
	
	public static void main(String[] args) {
		
		int x =0;
		int[] arr = {1,4,5,6,8,9,0,4};
		
		int search = lSearch(arr, x);
		
		System.out.println(search);
	}
	
	
	public static int lSearch(int[]  arr, int x) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
