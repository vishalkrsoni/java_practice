package java_practice;

import java.util.*;

public class Two_sum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Size:");
		int size=scan.nextInt();
		
		System.out.println("Enter values:");
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.print("values are:"+"\n[");
		
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]+"]");
		
		System.out.println("\nEnter target");
		int target = scan.nextInt();
		int output = 0;
		
		for (int i= 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]==target-arr[i]) {
					output=1;
				}
				else {
				output=0;
				}
			}
		}
		System.out.println(output);
		scan.close();	
	}
}
