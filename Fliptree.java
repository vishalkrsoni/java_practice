package java_practice;

import java.sql.*;
import java.util.*;

public class Fliptree {
	static Connection conn=null;
	static String db_name="my_db";
	static String url="jdbc:mysql://localhost:3306/"+db_name;
	static String username="root";
	static String password="Vish1234";
	static String driver_name="com.mysql.cj.jdbc.Driver";

	public static void main(String[] args)  {
		try {
			try {
				Class.forName(driver_name);
			}
			catch (ClassNotFoundException a)
			{
				System.out.println("class not found");
			}
			conn=DriverManager.getConnection(url,username,password);
			Scanner s=new Scanner(System.in);
			while (true) {
				System.out.print("Enter your choice:\n1.Task1 \n2.Task2 \n3.Exit\n");
				int choice = s.nextInt();
				s.nextLine();
				Statement statement= conn.createStatement();
				String query;
				String id;
				switch (choice) {
				case 1:	           			
					query= "select *from marvel_cinematic_Universe order by release_year desc;";
					ResultSet rs=statement.executeQuery(query);
					ResultSetMetaData rsmd=rs.getMetaData();
					int column_count=rsmd.getColumnCount();
					while(rs.next())
					{
						String outputs="";
						for(int i=1;i<=column_count;i++)
						{
							outputs+=rs.getString(i)+"\t\t";
						}
						System.out.println(outputs);
					}
					System.out.println();
					break;
				case 2:
					System.out.println("Enter movie id:");
					id = s.nextLine(); 
					System.out.println("Enter rating name:"); 
					String rating = s.nextLine();
					String stat = "UPDATE marvel_cinematic_Universe SET rating_name =\" " + rating + " \" WHERE movie_id =\" "+id+" \";";	
					statement.executeUpdate(stat);
					System.out.println("Success:");
					break;
				case 3:
					s.close();
					System.out.println("Good-Bye ");
					return;
				default:
					System.out.println("Invalid Choice\n");
				}
			}
		} catch (SQLException e) {
			System.out.println("sql exception occured");
		}
	}
}
