package harikrishna_Recharla.algo.linearSearch;

public class LinearSearch2 {

    public static void main(String[] args) {


        int[] arr = {1,3,4,57,7,3,3,5,4};

        int x=5;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                System.out.println("index --> "+i);
            }
        }

    }
}
