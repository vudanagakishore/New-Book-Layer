
package com.dao;

import java.util.HashMap;

import com.bean.Bean;

public class Dao 
{
	
	//Storing into the Dao
	HashMap<Integer,Bean> hm = new HashMap<Integer,Bean>();
	public void dao(Bean b)
	{	
		hm.put( b.getVehicleid(), b);  // adding into the Dao
		System.out.println("Book Was Added into The DateBase Successfully");
		System.out.println("The Following Are The Book Details Which You Added"); 
		System.out.println(hm);   //printing all the details that are entered
		
	}
	
	public HashMap retrive()
	{
		return hm;	
	}
}     