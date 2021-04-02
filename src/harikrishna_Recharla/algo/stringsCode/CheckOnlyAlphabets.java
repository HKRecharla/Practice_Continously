package harikrishna_Recharla.algo.stringsCode;

public class CheckOnlyAlphabets {

    public static void main(String[] args) {

        String s ="aerrgtyhthg";

        for (int i = 0; i < s.length(); i++) {
           char c =  s.charAt(i);
           if((!(c>= 'A' && c<= 'Z'))
           && (!(c>= 'a' && c<= 'z'))){
               System.out.println("Only string avalaible");
           }else{
               System.out.println("Integrs also available");
           }
        }

    }
}
