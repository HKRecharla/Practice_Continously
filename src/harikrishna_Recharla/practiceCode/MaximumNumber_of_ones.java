package harikrishna_Recharla.practiceCode;

public class MaximumNumber_of_ones {

    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int m =2;
        max(arr,m);
    }



    public static int max(int[] arr, int m){

        int size = arr.length;


        int count =0;

           for (int i = 0; i < size; i++) {
               int curr_count=0;
               int k=i;
               boolean flag=true;
               int j=m;
               while(flag){
                   if(k <size){
                       if(j>0 && arr[k] ==0 ){
                           curr_count++;
                           j--;
                       }else{
                           if(arr[k]!=0){
                               curr_count++;
                           }else{
                               flag=false;
                               break;
                           }
                       }
                   }else{
                       flag=false;
                   }
                   k++;
               }
               if(count < curr_count){
                   count = curr_count;
               }
           }

        System.out.println(count);
           return count;
       }


}
