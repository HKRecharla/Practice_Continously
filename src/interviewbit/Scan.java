package interviewbit;

import java.util.Scanner;

public class Scan {

	
	
		public static void main(String[] args) {
	        // YOUR CODE GOES HERE
	        // Please take input and print output to standard input/output (stdin/stdout)
	        // DO NOT USE ARGUMENTS FOR INPUTS
	        // E.g. 'Scanner' for input & 'System.out' for output
	        
	        Scanner scan = new Scanner(System.in);
	        int first = scan.nextInt();
	        int input=0;
	        int i=0;
	        int[] in = new int[first];
	        do{
	        input = scan.nextInt();
	        in[i]=input;
	        i++;
	        } while(first != i);
	        scan.close();
	        
	        for (int j = in.length-1; j >=0; j--) {
				System.out.println(in[j]);
			}
	       
	    }
       
    
}
