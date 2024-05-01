package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion{
	public static Connection connect() {
		Connection con=null;
		try {
			String url="jdbc:mysql://localhost:3306/basearchitecture";
			String login="root";
		    String mdp="1234";
		    
			con=DriverManager.getConnection(url,login,mdp);
			System.out.println("connected");
		

		}
       catch(SQLException e) {
    	   e.printStackTrace();;
       }
		return con;
	}
	public static void main(String args[]) {
		Connexion.connect();
	}
	
}
