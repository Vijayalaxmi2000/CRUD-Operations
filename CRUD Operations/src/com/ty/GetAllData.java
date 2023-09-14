package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAllData 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			Statement statement=connection.createStatement();
			ResultSet resultSet= statement.executeQuery("select * from student where age > 23 ");
			while(resultSet.next())
			{
				System.out.println("Student ID: "+resultSet.getInt(1));
				System.out.println("Student Name: "+resultSet.getString(2));
				System.out.println("Student Age: "+resultSet.getInt(3));
				System.out.println("============================");
			}
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
