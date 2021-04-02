package harikrishna_Recharla.practiceCode;

public class Trapping_Rain_water {

    public static void main(String[] args) {
    int arr[] = {6,9,9};
        trap(arr);
    }



    public static void trap(int[] arr){

        int size = arr.length;

        int count =0;
        for (int i = 1; i < size; i++) {

            int key = arr[0];
            if(key > arr[i]){
                count = count+(key-arr[i]);

            }
        }
        System.out.println(count);
    }
}
