package harikrishna_Recharla.algo.stringsCode;

public class ReverseString {


    public static void main(String[] args) {
    String str= "Harikrishna";
       String  fstr = reverse(str);
        System.out.println(fstr);


        String[] s = {"hari","krishna","Function"};
        s = reverse_array(s);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        char[] JavaCharArray = new char[5];
        JavaCharArray[0] = 'r';
        JavaCharArray[1] = 's';
        JavaCharArray[2] = 't';
        JavaCharArray[3] = 'u';
        reverse_char(JavaCharArray);
    }



    public static String reverse(String str){
        String fstr = "";
        for (int i=str.length()-1; i >= 0 ; i--) {
            char ch = str.charAt(i);
            fstr =fstr+ch;
        }
        return fstr;
    }


    public static String[] reverse_array(String[] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverse(arr[i]);
        }
        return arr;
    }


    public static void reverse_char(char[] s){
        char[] s1=new char[s.length];
        for (int i = s.length-1; i >=0 ; i--) {
            s1[i] = s[i];
        }
        System.out.println(s1);
    }
}
