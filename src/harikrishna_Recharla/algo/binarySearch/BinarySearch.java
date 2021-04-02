package harikrishna_Recharla.algo.binarySearch;

public class BinarySearch {

	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};

		int val = 7;

		int s = search_binary(arr,0,arr.length-1,val);

		System.out.println(s);
	}
	
	
	
	public static int search(int [] arr, int l, int r, int x) {
		
		 int n = arr.length;
		if(r>= l) {
			
			int mid = l+(r-1)/2;
			
			if(arr[mid] == x) {
				return mid;
			}
			
			if(arr[mid] > x) {
				return search(arr, l, mid-1, x);
			}else {
				return search(arr, mid+1, r, x);
			}
			
			
		}
		
		return -1;
	}


	/**
	 *
	 * arr,left,mid,val
	 *
	 * mid = left+(right-1)/2
	 *
	 * arr[mid] > val
	 * 	arr,left,mid-1,val
	 * arr[mid] < val
	 * 	arr, mid+1, right,val
	 *
	 *
	 * @param arr
	 * @return
	 */
	public static int search_binary(int[] arr, int left, int right,int s){
		int n = arr.length;

		if(right >= left){
			int mid = left + (right-left)/2;

			if(s == arr[mid]){
				System.out.println("Value present in --> "+mid);
				return mid;
			}

			if(arr[mid] > s){
				return search_binary(arr,left,mid-1,s);
			}else{
				return search_binary(arr,mid+1,right,s);
			}
		}
		return 0;
	}




	public static int mid(int[] arr){
		int n = arr.length;
		return  n/2;
	}

	public static void left(int[] arr){

	}

	public static void right(int[] arr, int searc){
		if(searc > arr[mid(arr)]){

		}
	}
	
	/**
	   if (mid >x)
	   		l-- mid-1
	   	else
	   		mid+1 -- r 
	 * 
	 */
	
	
	
	
	
	public static int search_dup(int[] arr, int l,int r, int x) {
		
		if(r>x) {
			
		int mid = l+(r-1)/2;
		
			if(arr[mid] == x) {
				return mid;
			}
			if(arr[mid] > x) {
				return search_dup(arr, l, mid-1, x);
			}else {
				return search_dup(arr, mid+1, r, x);
			}
			
			
		}
		
		
		return -1;
	}
	
	
	
	
	
	
}
