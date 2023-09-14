package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudent
{

	public static void main(String[] args)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			Statement statement =connection.createStatement();
			statement.execute("insert into student values(101,'manjari',23)");
			statement.execute("insert into student values(102,'mahesh',24)");
			statement.execute("insert into student values(103,'manoj',25)");
			statement.execute("insert into student values(104,'madhav',24)");
			statement.execute("insert into student values(105,'madhu',24)");
			
			connection.close();
			System.out.println("Data saved");
		} 
		catch (ClassNotFoundException | SQLException e)
		{	
			e.printStackTrace();
		}
		

	}

}
