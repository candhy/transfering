package com.cg.login.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.login.exception.ExceptionMessage;
import com.cg.login.exception.LoginException;

//import com.cg.login.service.Connection;

public class Dbconnection {
	private static Connection connection=null;


	public static Connection getConnection() throws LoginException {
		if(connection==null)
		{
		try
		{
		
		connection=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl");
		}
		catch(SQLException e)
		{
			throw new LoginException(ExceptionMessage.Message);
		}
	
	}
		return connection;

}
}
