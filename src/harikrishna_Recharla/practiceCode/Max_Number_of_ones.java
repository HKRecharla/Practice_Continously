package harikrishna_Recharla.practiceCode;

public class Max_Number_of_ones {


    public static void main(String[] args) {

        int[][] arr={{1,0,0,1},
                    {0,0,1,1},
                    {0,0,1,1},
                    {0,1,1,1}};

        int row = find(arr);
        System.out.println(row);
    }


    public static int find(int[][] arr){
            int a =0;
            int b=1;

        int pre_count =0;

        int row =0;
        int max_row =0;
        for (int i = 0; i < arr[0].length; i++) {
            int curr_count =0;
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == b){
                    curr_count++;
                }
            }
            if(pre_count < curr_count){
                pre_count = curr_count;
                max_row = row;
            }
            row++;
        }
        return max_row;
    }


}
