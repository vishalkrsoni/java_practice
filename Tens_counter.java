package java_practice;

import java.util.*;

public class Tens_counter {
	public static void main(String[] args) {
		 //long in=102030105010;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no:\n");
	long input = sc.nextLong();	
	int count=0;
	while (input!=0)
	{
		long rem=input%100;
		if (rem==10)
		{
			count++;
		}
		input=input/100;
	}
	System.out.println(count);
	sc.close();
}
}
