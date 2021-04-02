package interviewbit;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;


public class BuffReader {
	
	
	public static void main(String[] args) {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		Stream<String> lines = buff.lines();
		
		for (int i = 0; i < lines.count(); i++) {
			System.out.print(lines.toString());
		}
	}

}
