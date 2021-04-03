package org.btm.insertApp;

import java.sql.*;

public class InsertValues 
{
   public static void main(String[] args)
   {
	   Connection con = null;
	   Statement stmt = null;
	   String qry = "insert into btm.student value(1,'Sreejit',89.8)";
	   
	   try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Class loaded and registred");
		con =DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
		System.out.println("Connection established");
		stmt = con.createStatement();
		System.out.println("Platform or statment created");
		stmt.executeUpdate(qry);
		System.out.println("Data inserted");
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	   finally
	   {
		   if(stmt!=null)
		   {
			   try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		   }
		   if(con!=null)
		   {
			   try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			   
		   }
	   }
   }
}
