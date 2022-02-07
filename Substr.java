package java_practice;

import java.util.Scanner;

public class Substr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string1:");
		String input1 = scan.next();
		System.out.println("Enter string2:");
		String input2 = scan.next();
		/*
		String input1="qwertyuiop";
		String input2="qwertyui";*/
		String removed = "";
		int shorter,longer;
		
		if (input1.length() > input2.length()) {
			shorter = input2.length();
			longer = input1.length();
		}
		else {
			longer = input2.length();
			shorter = input1.length();
		}
		
		for (int i = 1; i <longer; i++) {
			
		if(i<shorter){
			if((input1.charAt(i))==(input2.charAt(i))) {
				System.out.println("okk");
			}
			else {
				removed += input1.charAt(i);
			}
		}
		else{
				removed += input1.charAt(i);
			}
			i++;
		}
			
		System.out.println("removed str is: "+removed);
		scan.close();
	}
}
