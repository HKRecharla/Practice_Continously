package interviewbit;

import java.util.Scanner;

public class TwoDimenstion {

	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String[] s =  scan.nextLine().split(" ");
		int s1 = Integer.parseInt(s[0]);
		int s2 = Integer.parseInt(s[1]);
		int[][] in = new int[s1][s2];
		
		int i =0;
		String str= "";
		do{
			String[] sp =  scan.nextLine().split(" ");
			int val =0;
				int f =0;
				for (int j2 = 0; j2 < s2; j2++) {
					f = f+Integer.parseInt(sp[j2]);
				}
				str = str+f+" ";
				
	        i++;
	        } while(s1 != i);
	        scan.close();
		str = str.substring(0,str.length() - 1);
	System.out.println(str);
	        
	}
}
