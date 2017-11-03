/* SVN Practice
###############
#################
#############*/package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.util.DBUtil;
import com.vo.UserBean;

public class UserDao {
	
	
	public boolean checkUser(final UserBean user)
	
	{
		
		final String uname=user.getName();
		final String pswd=user.getPswd();
		
		final UserBean user1= getUserId(uname);
		
		
		if(user1!=null && user1.getName().equals(uname) && user1.getPswd().equals(pswd))
		
            return true;
        else
         
            return false;
		
	
			
		
    }
	public UserBean getUserId(final String uname)
	{
		//String uname1="u001";
			//	String upswd="xyz";
		final UserBean user1=new UserBean();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			
		
		
		 con=DBUtil.getConnection();
		 System.out.println("hello");
		 ps=con.prepareStatement("select * from user1 where uiid= ?");
		 System.out.println("hello1");
		
		
		ps.setString(1,uname);
		 System.out.println("hello2");
		 rs=ps.executeQuery();
		// System.out.println(rs.next());
		if(rs.next())
		{
			System.out.println("hi");
			System.out.println(rs.getString(1)+rs.getString(2));
			   
			     user1.setName(rs.getString(1));
			   
			    user1.setPswd(rs.getString(2)); 
			   // System.out.println(user.getName()+user.getPswd());
		}
		else{
			user1.setName(""); 
			user1.setPswd("");
		}
				//user.setName(uname1);
				//user.setPswd(upswd);
		}
		catch(final SQLException e1)
		{
			e1.printStackTrace();
		}
		catch(final ClassNotFoundException e2)
		{
			e2.printStackTrace();
		}
		catch(final Exception e3)
		{
			e3.printStackTrace();
		}
		finally{
			if(ps!=null)
				try
			{
					ps.close();
			}
			catch(final Exception e)
			{
				e.printStackTrace();
			}
			if(rs!=null)
				try
			{
					rs.close();
			}
			catch(final Exception e)
			{
				e.printStackTrace();
			}
			if(con!=null)
				try
			{
					con.close();
			}
			catch(final Exception e)
			{
				e.printStackTrace();
			}
			
		}
		//System.out.println(user.getName()+user.getPswd());
		
		return user1;
		
		
	

			    
		 
			
		
		
		
	}
	
		
	}


