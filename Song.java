package java_practice;
import java.util.Scanner;
public class Song 
{
	   void song_no(int time,int count)
       {	
			String song;
			Scanner S1 = new Scanner(System.in);
			System.out.println("Enter song"+count+" length(in m:s format):");
	   		song=S1.next();
	   		
	   		String[] new_str=song.split(":");
	   		
			int minutes=Integer.parseInt(new_str[0]);
			
			int seconds=Integer.parseInt(new_str[1]);
			
			int song_length= (60*minutes)+seconds;
			
			if ((time-song_length)>=0)
			{	
				time=time-song_length;
				count++;
				song_no(time,count);
			}
			else
			{
				System.out.println("You were listening to song no. "+count);
				S1.close();
			}
   		}
	   public static void main(String[] args) 
	   {
	        int distance,speed,time_travelled,count=1;
	        Song Sng= new Song();
	        Scanner S = new Scanner(System.in);
	        System.out.println("Enter Distance travelled(in meters):");
	        distance=S.nextInt();
	        System.out.println("Enter Speed(in m/s):");
	        speed=S.nextInt();
	        time_travelled=distance/speed;
	        
	        Sng.song_no(time_travelled,count);
	        S.close(); 
	   }
}
