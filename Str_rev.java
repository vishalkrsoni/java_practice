package java_practice;

import java.util.*;

public class Str_rev {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scan.nextLine();
		String rev="";
		for (int i =input.length()-1; i >=0 ; i--) {
			rev+=input.charAt(i);
		}
		System.out.println("Rev is:\n"+rev);
		scan.close();
	}
}
