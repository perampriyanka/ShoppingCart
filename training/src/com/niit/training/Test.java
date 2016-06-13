package com.niit.training;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.niit.training.bean.Account;
import com.niit.training.bean.Customer;

public class Test {
	public static void displayAccountDetails(Account a)
	{
		System.out.println(a.getId());
		System.out.println(a.getName());
	}
	
	public static void display(Customer c)
	{
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getPassword());
	List accounts=c.getMyAccounts();	
	java.util.Iterator it = accounts.iterator();
	while(it.hasNext())
	{
		Account a=(Account)it.next();
		displayAccountDetails(a);
	}
	
	}
 public static void main(String[] args) {
	Customer c1=new Customer();
	c1.setId("101");
	c1.setName("Cust1");
	c1.setPassword("NIIT");
	Account ac=new Account();
	ac.setId(10001);
    ac.setName("SB");
   List Accounts=new ArrayList();
    Accounts.add(ac);
    ac=new Account();
    ac.setId(10002);
    ac.setName("CA");
    c1.setMyAccounts(Accounts);
    Test.display(c1);
    
    
    
 
 
 
 
 }

	
}


