package harikrishna_Recharla.practiceCode;

public class MissingNumber {


    public static void main(String[] args) {
        int[] arr = {2};
       int  n = arr.length;
        int val = missing(arr,n);

        System.out.println(val);
    }

   static  int MissingNumber(int array[], int n) {
        for(int i=0;i<n;i++){
            if(array[i] != i+1){
                return i+1;
            }
        }
        return 0;
    }


    static int missing(int[] arr, int n){
        int  total;
        total = (n+1)* (n+2)/2;
        for (int j = 0; j < n; j++) {

            total = total-arr[j];
        }

        return total;
    }
}
