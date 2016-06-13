package com.niit.ShoppingCart.DAO;

public class UserDAO {
	public boolean isValidCredentials(String userid,String password)
	{
		if(userid.equals("NIIT") && password.equals("NIIT@123"))
			
				{
					return true;
				}
		else
		{
			return false;
			
		}
	}

}
