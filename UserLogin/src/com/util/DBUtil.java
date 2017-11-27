/* DBUtill Comments   */
*************************

package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection con=null;
public static Connection getConnection()throws SQLException,ClassNotFoundException
{
	try{
		
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("hi");
	
	 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","system");
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	} 
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	} 
	catch(Exception e)
	{
		e.printStackTrace();
	} 
	return con;
}


}
