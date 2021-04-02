package harikrishna_Recharla.algo.greedyAlgo;

public class Minimum_activity {


    public static void main(String[] args) {


        int[] a ={1, 3, 0, 5, 8, 5};
        int[] b = {2, 4, 6, 7, 9, 9};

        activity(a,b);
    }

    public static void activity(int[] a, int[] b){

        int val = 0;
        System.out.print(val+" ");

        int j=0;
        for (int i = 1; i < a.length; i++) {
            if(a[i] >= b[j]){
                j=i;
                System.out.print(i+" ");
            }
        }
    }

}
