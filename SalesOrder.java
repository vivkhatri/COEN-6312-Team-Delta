package com.inventory;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class SalesOrder{
	
	static int orderNum = 0 ;
	static Date orderDate;
	static String custId;
	static String empId;
	static int itemId;
	static int orderAmount;
	static String shippingAddress;
	static Date shippingDate;
	static int orderStatus;
	static int noOfItems;
	

	public static boolean isItemAvailable(int itemId)
	{
		boolean present = false;
		// make present = true if item present
		if(present)
			return true ; // if item available
		else
			return false;
		//code for checking if the item present in inventory or not
	}

	public static void invoiceGeneration()
	{
		//code for generating the invoice
	}
	
	public static void createOrder()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("*************Enter Order details*************/n");
		System.out.println("Enter shipping address");
		String s = sc.nextLine();	
		shippingAddress = s;
		System.out.println("Enter item ID ");
		int id = sc.nextInt();
		itemId = id;
		System.out.println("Enter customer id");
		String cid = sc.nextLine();
		custId = cid;
		System.out.println("Enter order amount ");
		int amt = sc.nextInt();
		orderAmount = amt;
		System.out.println("Enter employee id");
		String eid = sc.nextLine();
		empId = eid;
		System.out.println("Enter number of items");
		int num = sc.nextInt();
		noOfItems = num;
		orderNum++;
		Calendar cal = Calendar.getInstance();
		orderDate = (Date) cal.getTime();
		

		

	}



	public static boolean inventoryCheck(int itemId)
	{
		boolean itemPresent = false;

		if(isItemAvailable(itemId))
		{
			itemPresent = true;
		}

		return itemPresent;
	}

	public static void main(String args[])

	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Order details");
		createOrder();
		
		if (inventoryCheck(itemId))
		{
			System.out.println("Order Confirmed");
			invoiceGeneration();
		}
		else
		{
			System.out.println("Item not present in Inventory. Order Cancelled.");
		}
	}

}
