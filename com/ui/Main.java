package com.ui;

import java.util.*;

public class Main 
{
	public static void main(String [] args)
	{
		Scanner keyboard=new Scanner(System.in);
		BookRecord b = new BookRecord();
		while(true)
		{
			System.out.println("*******************************************");
			System.out.println("*******Welcome To The Library**************");
			System.out.println("*******************************************");

			
			System.out.println("Specify your choice:\n"
					+ "1.Add Book into the Database\n"
					+ "2.Retriving the Book By using the BookId\n"
					+ "3.Exit From The Service");
			int choice = keyboard.nextInt();
			
			switch(choice)
			{
			case 1:
				b.addBook();
				break;
			case 2:
				//System.out.println(":");
				b.retrive();
				break;
				default:
					System.out.println("Your Are Exited From Our Service");
					System.exit(0);
			}
		}
		
	}
}
