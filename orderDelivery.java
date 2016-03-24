package com.inventory;
import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class orderDelivery extends SalesOrder {

static int orderDeliveryNo = 0 ;
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

public static void deliveryDispatch()
{
	//code for dispatching the order
}


public static void createDelivery()
{
	createOrder();
	//code for dispatching the order
}



public static boolean checkItem(int itemId)
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
	
		createDelivery();
	
	if (checkItem(itemId))
	{
		System.out.println("Delivery Confirmed");
		deliveryDispatch();
	}
	else
	{
		System.out.println("Item not present in Inventory. Delivery Cancelled.");
	}
}

}


