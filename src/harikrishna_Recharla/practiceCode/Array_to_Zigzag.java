package harikrishna_Recharla.practiceCode;

public class Array_to_Zigzag {


    public static void main(String[] args) {

        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        arr =  zig(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    public static int[] zig(int[] arr){

        boolean flag = true;
            int i=0;
       while(i<arr.length-1){

            if(flag){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }else{

                if(arr[i] < arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }

            flag =!flag;
            i++;
        }
        return arr;
    }

    public static void swap(int a, int b){

    }
}
