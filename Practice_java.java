package java_practice;
import java.util.*;
public class Practice_java 
{
	void shift(int arr[])
	{
		int temp,size=arr.length;
		temp=arr[0];
		for(int i=0;i<size-1;i++) 
		{
			arr[i]=arr[i+1];
		}
		arr[size-1]=temp;
		System.out.print("Desired Output is:\n");
		for(int i=0;i<size;i++) 
		{
			System.out.print("-"+arr[i]+"-");			
		}	
	}
	public static void main(String[] args)
	{
		int size;
		Practice_java p=new Practice_java();
		Scanner S=new Scanner(System.in);
		System.out.print("Enter total no. of inputs:");
	    size = S.nextInt();
	    int arr[] = new int[size];
	    System.out.print("Enter inputs:\n");
	    for (int i = 0; i < size; i++) 
	    {
	    	arr[i] = S.nextInt();
	    }
	    S.close();
	    p.shift(arr);
	}
}
