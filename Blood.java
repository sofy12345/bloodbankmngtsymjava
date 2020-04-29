import java.sql.*; 
import java.util.*;
import javax.sql.*;
class Blood 
{
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3308/bbm";
	
	public static void main(String args[]) 
	{ 
			
		Connection con = null;
		String username="root";
		String password="";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver"); 
			System.out.println("CONNECTING DATABASE.....");
			con=DriverManager.getConnection( "jdbc:mysql://localhost:3308/bbm?useSSL=false",username,password); 
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("select * from user"); 
			while(rs.next()) 
			{ 
				System.out.println(rs.getString(1)+" "+rs.getInt(2)); 
			} 
			rs.close();
			stmt.close();
			con.close(); 
		}
		catch(Exception e) 
		{ 
			System.out.println("CATCH JAVA DATABASE CONNECTION       " +e); 
		}
		System.out.println("JAVA DATABASE CONNECTION BYEE............       ");
	}
}