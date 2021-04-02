package harikrishna_Recharla.practiceCode;

public class GreedyAlgo {

    public static void main(String[] args) {

        int[] s  =  {1, 3, 0, 5, 8, 5};
        int[] f =  {2, 4, 6, 7, 9, 9};

        greedy(s,f);
    }


    public static void greedy(int[] s, int[] f){

        int i=0;
        System.out.print(i+" ");

        for (int j = 1; j < s.length; j++) {

            if(s[j] >=f[i]){
                i=j;
                System.out.print(j +" ");
            }
        }
    }
}
