package interviewbit;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrrrrayList {
	
	
	public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        String input="";
        ArrayList<Integer> array = new ArrayList<>();
        
    
        
        while(scan.hasNextInt()) {
            int temp = scan.nextInt(); 
            if( temp < 0) {
              break;
            } else {
            	array.add(temp);
            }
          }
//            while (scan.hasNextLine()){
//
//                String line = scan.nextLine();
//                if (line.equals("") || line == null) {
//                    break;
//                }else {
//                	array.add(line);
//                }
//            }
            scan.close();

        
        String str = "";
        
        for (int i = array.size()-1; i>=0; i--) {
        	if(array.get(i)>=0) {
        		str = str+array.get(i)+" ";
        	}
		}
        
        str = str.substring(0,str.length() - 1);
        System.out.print(str);
        
    }

}
