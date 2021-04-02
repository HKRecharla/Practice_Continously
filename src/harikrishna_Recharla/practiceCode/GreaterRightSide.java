package harikrishna_Recharla.practiceCode;

public class GreaterRightSide {


    public static void main(String[] args) {


        int[] arr = {16,17,4,3,5,2};
        int n = arr.length;
       arr =  greater(arr,n);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    public static int[] greater(int[] arr, int n){

        int size = arr.length;
        int max = arr[size-1];

        arr[size-1] = -1;

        for (int i = size-2; i >=0 ; i--) {

            int temp = arr[i];
            arr[i] =max;

            if(max<temp)
                max=temp;
        }
        return arr;
    }


    public static int max(int a ,int b){
        if(a>b){
           return a;
        }else{
            return b;
        }
    }
}
