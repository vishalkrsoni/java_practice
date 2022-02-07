package java_practice;

import java.util.*;

public class Collections_Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		arr1.add(4);
		arr1.add(6);
		//arr1.set(3,9);
		arr1.add(11);
		arr1.add(20);
		arr1.add(1,7);
		
		System.out.println(arr1);
		
		for (Integer value : arr1) {
			arr2.add(value);
		}
		System.out.println(arr2);	
	}
}
