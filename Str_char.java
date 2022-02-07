package java_practice;

import java.util.*;

public class Str_char {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your string:");
		String input = scan.nextLine();
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));	
		}
		
		System.out.println("Alternate characters are:");
		for (int i = 1; i < input.length(); i++) {
			System.out.print(input.charAt(i)+" ");
			i++;		
		}
		scan.close();	
	}
}
