package java_practice;
import java.util.Scanner;
public class Solution 
{
	public void solution(int N)
	{	
		for(int i=1;i<=N;i++)
		{
			if (i<N)
			{
				 System.out.println("L");	
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("L");
				}
			}
		}
	}	
	public static void main(String[] args) {
	        int N;
	        Solution Sol= new Solution();
	        Scanner S = new Scanner(System.in);
	        System.out.println("Enter Size:");
	        N=S.nextInt();
	        S.close();
	        Sol.solution(N);        
	 }
}
