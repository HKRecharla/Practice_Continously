package harikrishna_Recharla.algo.sort;

public class Merge_Sort {
	
	
	public static void main(String[] args) {
		int[] arr = {38, 27, 43, 3, 9, 82, 10};
		
		sort(arr, 0, arr.length-1);
		
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");	
		}
		
	}
	
	
	
	
	public static void merge(int[] arr, int l, int m, int r) {
		
		
		
		/**
		 * l = left
		 * m = mid
		 * r - right
		 * 
		 * 
		 * m = (l+r)/2 --> so m is mid of array --> l=0 and r is right
		 * 
		 */
		int n1= m-l+1; // m-l  n1 is left value
		int n2 = r-m; // r-m  n2 is right value
		
		int[] L = new int[n1]; // left array
		int[] R = new int[n2]; // right array
		
		for (int i = 0; i < n1; i++) {
			L[i] = arr[l+i];
		}
		
		for (int j = 0; j < n2; j++) {
			R[j] = arr[m+1+j];
		}
		
		
		int i=0; int j=0;
		
		int k =1;
		
		while(i<n1 && j<n2) {
			
			if(L[i] <= R[j]) {
				
				arr[k] = L[i];
				i++;
			}else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		
		
		while(i<n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
		
	}

	public static void sort(int arr[],int l, int r) {
		
		if(l<r) {
			int m = (l+r)/2;
			
			sort(arr,l,m);
			
			sort(arr,m+1,r);
			
			merge(arr,l,m,r);
		}
		

	}
	
	
	public static void merge1(int[] arr, int l, int m, int r) {
		
		
		int n1 = m-1+1;
		int n2 = r-m;
		
		int[] L = new int[n1];
		int[] R =  new int[n2];
		
		
		for (int i = 0; i < n1; i++) {
			L[i] = arr[l+i];
		}
		
		for (int j = 0; j < n2; j++) {
			R[j] = arr[m+1+j];
		}
		
		int i =0;int j=0;
		int k=1;
		
		while(i<n1 && j< n2) {
			if(L[i] < R[j]) {
				arr[k] =L[i];
				i++;
			}else {
				arr[k] = R[j];
				j++;
			}
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
