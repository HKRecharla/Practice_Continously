package harikrishna_Recharla.algo.greedyAlgo;

import java.util.HashMap;
import java.util.Map;

public class NonRepeat_Numbers {


    public static void main(String[] args) {
       int arr[] = {10, 20, 10, 30, 10, 30, 30} ;

        nonRepeat(arr);
    }



    public static void nonRepeat(int[] arr){
        int size = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if(map.get(arr[i]) == null){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue()== 1){
                System.out.println(entry.getKey());
            }
        }

    }
}
